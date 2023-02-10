import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
/*
1 : 1
2 : 3
3 : 5
4 : 11
5 : 21
6 : 43
7 : 85
8 : 171


arr[n] = arr[n-2] + ( 2 * arr[n-1] )
 * */
	
	public static long[] memo = new long[1009];
	
	
	public static void main(String[] args) {
		memo[1] = 1;
		memo[2] = 3;
		memo[3] = 5;
		memo[4] = 11;
		memo[5] = 21;
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			cal(i);
		}
	System.out.println(cal(N));
	}


	private static long cal(int num) {
		// TODO Auto-generated method stub
		if(num <= 5 || memo[num] != 0) return memo[num];
		else memo[num] = ((cal(num-1) % 10007) + (( 2 * cal(num-2)) % 10007)) % 10007;
		return memo[num];
	}
}