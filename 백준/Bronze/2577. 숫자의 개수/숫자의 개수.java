import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String[] yxbag = br.readLine().split(" ");

 */

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		
		long a1 = Integer.parseInt(br.readLine());
		long a2 = Integer.parseInt(br.readLine());
		long a3 = Integer.parseInt(br.readLine());
		
		
		long a4 = a1 * a2 * a3;
		String s1 = Long.toString(a4);
		int[] numberMap = new int[10];

		for(int i = 0; i < s1.length(); i++) {
			numberMap[s1.charAt(i) - '0']++;
		}
		
		for(int i = 0; i < 10; i++)System.out.println(numberMap[i]);
	}
}