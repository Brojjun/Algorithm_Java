import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


/*
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String[] yxbag = br.readLine().split(" ");

 */

public class Main {
		
	public static void main(String[] args) throws Exception {
		//input
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] num = br.readLine().split(" ");
		int num1 = Integer.parseInt(num[0]);
		int num2 = Integer.parseInt(num[1]);

		
		BigInteger a1 = BigInteger.valueOf(num1);
		BigInteger a2 = BigInteger.valueOf(num2);
		int c1 =a1.gcd(a2).intValue(); //  최대공약수
		int c2 = (num1*num2) / c1;
		
		System.out.println(c1);
		System.out.println(c2);
		
	}
}