import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Main {

	
	static StringBuffer sb = new StringBuffer();

	
	static int[] map;
	static int bn;
	static long bc;
	static long end;


	public static void upper_bound() {
		long begin = 1;

		long ret = 0;
		while(begin <= end) {
			long mid = (begin + end) / 2;
			
			if(mid == 0)break;
			
			long cnt = 0;
			
			for(int i = 0; i < bn; i++) 
				cnt += map[i] / mid;
			
			if(cnt >= bc) {
				begin = mid + 1;
				ret = Math.max(ret, mid);
			}
			else end = mid - 1;
			
		}
		System.out.println(ret);
	}
	
	public static int check(long mid) {
		if(mid == 0)return 0;
		int cnt = 0;
		for(int i = 0; i < bn; i++) 
			cnt += map[i] / mid;
		
		//System.out.println(mid + " : "+cnt);
		return cnt;
	}


	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		bn = sc.nextInt();
		bc = sc.nextInt();
		map = new int[bn];
		for(int i = 0; i < bn; i++) {map[i] = sc.nextInt(); end = Math.max(end, map[i]);}
		upper_bound();
		
	}
}
