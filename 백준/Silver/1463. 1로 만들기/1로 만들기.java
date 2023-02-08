import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static long[] cal = new long[1000009];

	public static long calcul(int n) {
		if(n <= 1)return 0;
		
		else if (n <= 3)return 1;
		
		else if(cal[n] == 0) {
			if(n % 2 == 0 && n % 3 == 0) cal[n] = Math.min(Math.min(calcul(n - 1), calcul(n / 2)),calcul(n / 3)) + 1;
			else if(n % 3 == 0) cal[n] = 1 + Math.min(calcul(n - 1), calcul(n / 3));
			else if(n % 2 == 0) cal[n] = 1 + Math.min(calcul(n - 1), calcul(n / 2));
			else cal[n] = 1 + calcul(n - 1);
				
		}
		
		return cal[n];
	}	
	
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		cal[1] = 0;
		cal[2] = 1;
		cal[3] = 1;
		for(int i = 0; i < N; i++)calcul(i);
		
		System.out.println(calcul(N));
		
		//for(int i = 0; i <= N; i++) System.out.println(i + " : " + cal[i]);
	
		
		
	}
}