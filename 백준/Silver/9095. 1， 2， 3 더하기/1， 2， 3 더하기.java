import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	/*
	 * 0 : 0
1 : 1 = 1
2 : 1 + 1, 2 = 2
3 : 1 + 1 + 1 / 1 + 2, 2 + 1 / 3 = 4
4 : 1+1+1+1 / 1+1+2, 1+2+1, 2+1+1 / 2+2 / 1+3, 3+1 / = 7
5 : 11111 / 1112,1121,1211,2111 / 122, 212, 221 / 311,131,113, / 23, 32 = 13

6 : 111111 / 11112	 * 5 / 1122, 1212, 2112, 2121, 2211, 1221(6)/ 222 / 1113(4) / 123,132,213,231,312,321(6) / 33
 = 23

7 : 44

1 = 1
2 = (1) + 1;
3 = (2) + (1) + 1;
4 = (3) + (2) + (1);
5 = (4) + (3) + (2);
6 = (5) + (4) + (3) - 1 만약 6이 24라면
7 = 24 + 13 + 7 = 44

=> arr[n] = arr[n-1] + arr[n-2] + arr[n-3]
	 * 
	 */
	public static long[] memo = new long[1000009];
	
	
	public static void main(String[] args) {
		memo[0] = 0;
		memo[1] = 1;
		memo[2] = 2;
		memo[3] = 4;
		memo[4] = 7;
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i = 0; i < N; i++) {
			int M = sc.nextInt();
			
			for(int j = 4; j < M; j++) {
				cal(j);
			}
			
			System.out.println(cal(M));
		}
	}


	private static long cal(int num) {
		// TODO Auto-generated method stub
		if(num < 5 || memo[num] != 0) return memo[num];
		else memo[num] = memo[num-1] + memo[num-2] + memo[num -3];
		return memo[num];
	}
}