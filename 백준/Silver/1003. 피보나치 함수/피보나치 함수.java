import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static long[] memoZero = new long[50];
	public static long[] memoOne = new long[50];
	
	public static long makeFiboO(int n) {
		if(n==0)return 0;
		
		if(n==1)return 1;
		
		if(memoOne[n] == 0)
			memoOne[n] = makeFiboO(n-1) + makeFiboO(n-2);
		
		return memoOne[n];
	}
	
	public static long makeFiboZ(int n) {
		if(n==0)return 1;
		
		if(n==1)return 0;
		
		if(memoZero[n] == 0)
			memoZero[n] = makeFiboZ(n-1) + makeFiboZ(n-2);
		
		return memoZero[n];
		
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		memoZero[0] = 1;
		memoOne[1] = 1;
		for(int i = 0; i < N; i++) {
			int M = Integer.parseInt(br.readLine());
			System.out.println(makeFiboZ(M) + " " +makeFiboO(M));
		}
		
	}
}