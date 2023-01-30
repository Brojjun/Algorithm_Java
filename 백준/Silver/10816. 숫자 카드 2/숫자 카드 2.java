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

class Dat {
	int at;
	int data;

	public Dat(int at, int data) {
		this.at = at;
		this.data = data;
	}
}

public class Main {

	static StringBuffer sb = new StringBuffer();

	static int bn;
	static int[] map;
	static int[] cnt;


	public static int lower_bound (int target) {
		int begin = 0;
		int end = bn;
		while (begin < end) {
			int mid = (begin + end) / 2;
			
			if (map[mid] >= target) end = mid;
			else begin = mid + 1;
		}
		return end;
	}

	public static int upper_bound (int target) {
		int begin = 0;
		int end = bn;
		
		while (begin < end) {
			int mid = (begin + end) / 2;
			
			if (map[mid] > target) end = mid;
			else begin = mid + 1;
		}
		//if(end == bn-1)return end+1;
		return end;
	}


	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated constructor stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		bn = Integer.parseInt(br.readLine());
		map = new int[bn];
		String[] imm = br.readLine().split(" ");
		for (int i = 0; i < bn; i++) {
			map[i] = Integer.parseInt(imm[i]);
		}

		Arrays.sort(map);
//		for (int i = 0; i < bn; i++) {
//			System.out.print(map[i]+ " ");
//		}
		
		int bm = Integer.parseInt(br.readLine());

		String[] immm = br.readLine().split(" ");

		for (int i = 0; i < bm; i++) {
			int low = lower_bound((Integer.parseInt(immm[i])));
			int high = upper_bound((Integer.parseInt(immm[i])));
			//System.out.println(immm[i] + " : " + high + " - " + low);
			sb.append(high-low + " ");

		}
		System.out.println(sb.toString());
	}
}
