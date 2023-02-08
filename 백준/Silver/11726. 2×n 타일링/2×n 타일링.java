import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
/*
1 : 1
2 : 2
3 : 3
4 : 5
5 : 8
6 : 13
7 : 21
8 : 34
9 : 55

arr[n] = arr[n-2] + arr[n-1]
 * */
	
	public static long[] memo = new long[1000009];
	
	
	public static void main(String[] args) {
		memo[1] = 1;
		memo[2] = 2;
		memo[3] = 3;
		memo[4] = 5;
		memo[5] = 8;
		
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
		else memo[num] = ((cal(num-1) % 10007) + (cal(num-2) % 10007)) % 10007;
		return memo[num];
	}
}