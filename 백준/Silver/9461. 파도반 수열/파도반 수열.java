import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	/*
1 : 1
2 : 1
3 : 1
4 : 2
5 : 2
6 : 3 
7 : 4 ( 3 + 1) =>(6) + (2)
8 : 5 ( 4 + 1) =>(7) + (3)
9 : 7 ( 5 + 2) =>(8) + (4)
10: 9 (7 + 2) =>(9) + (5)

(n) = (n-1) + (n-5)
	 * 
	 */
	public static long[] memo = new long[1000009];
	
	
	public static void main(String[] args) {
		memo[0] = 0;
		memo[1] = 1;
		memo[2] = 1;
		memo[3] = 1;
		memo[4] = 2;
		memo[5] = 2;
		memo[6] = 3;
		memo[7] = 4;
		memo[8] = 5;
		memo[9] = 7;
		memo[10] = 9;
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i = 0; i < N; i++) {
			int M = sc.nextInt();
			for(int j = 9; j < M; j++) cal(j);
			System.out.println(cal(M));
		}
	}


	private static long cal(int num) {
		// TODO Auto-generated method stub
		if(num <= 10 || memo[num] != 0) return memo[num];
		else memo[num] = cal(num-1) + cal(num-5);
		return memo[num];
	}
}