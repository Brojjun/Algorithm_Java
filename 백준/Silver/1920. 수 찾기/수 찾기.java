import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int[] map;
	static int bn;
	
	//이진탐색
	public static void binaryfind(int n) {
		int begin = 0;
		int end = bn - 1;
		
		// while 내의 조건 <= 인 이유 : 같을 경우를 무시하면 이진탐색 마지막에 탐색하지 않고 종료
		while(begin <= end) {
			int mid = (begin + end) / 2;
			
			if(map[mid] > n) {
				end = mid - 1;
			}
			else if(map[mid] < n) {
				begin = mid + 1;
			}
			else if(map[mid] == n) {
				System.out.println("1");
				return;	
			}
			
		}
		System.out.println("0");
		return;
		
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated constructor stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		bn = Integer.parseInt(br.readLine());
		map = new int[bn];
		String[] imm = br.readLine().split(" "); 
		for(int i = 0; i < bn; i++) {
			map[i] = Integer.parseInt(imm[i]);
		}
		
		Arrays.sort(map);
	
		int bm = Integer.parseInt(br.readLine());
		
		String[] immm = br.readLine().split(" "); 
	
		for(int i = 0; i < bm; i++) {
			binaryfind(Integer.parseInt(immm[i]));
		}
		
		
	}
}
