
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;


/*
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String[] yxbag = br.readLine().split(" ");

 */

public class Main {
		
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] numberMap = new int[1002];
		
		//소수 표기
		for(int i = 2; i <= 1000; i++) {
			if(numberMap[i] >= 1)continue;
			numberMap[i] = 2;
			for(int j = i;j <= 1000; j += i) {
				if(numberMap[j] == 0) numberMap[j] = 1;
			}
		}
		
		int bn = Integer.parseInt(br.readLine());
		int[] cntMap = new int[bn];
		String a[] = br.readLine().split(" ");
		
		int cnt = 0;
		for(int i = 0; i < a.length; i++) {
			if(numberMap[Integer.parseInt(a[i])] == 2) cnt++;
			
		}
		System.out.println(cnt);
	}
}