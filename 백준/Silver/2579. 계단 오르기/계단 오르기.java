import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static long[] stairs = new long[1000009];
	public static long[] memo = new long[1000009];
	
	public static long walk(int n) {
		if(n < 0) return 0;
		
		if(memo[n] == 0)
		memo[n] = Math.max(stairs[n] + stairs[n-1] + walk(n-3), stairs[n] + walk(n-2));
		
		return memo	[n];
	}
	
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		

		
		for(int i = 0; i < N; i++) {
			stairs[i] = Integer.parseInt(br.readLine());
		}
		
		memo[0] = stairs[0];
		memo[1] = stairs[0] + stairs[1];
		memo[2] = Math.max(stairs[0] + stairs[2], stairs[1] + stairs[2]);
		
		for(int i = 0; i < N; i++) {
			walk(i);
			//System.out.println(i + " : " + memo[i]);
		}
	
		System.out.println(memo[N-1]);
		
	}
}