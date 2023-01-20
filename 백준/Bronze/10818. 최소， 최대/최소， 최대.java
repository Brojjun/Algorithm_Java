import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String[] yxbag = br.readLine().split(" ");

 */

public class Main {
	public static void main(String[] args) throws Exception {
		//input
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] num = br.readLine().split(" ");
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < n; i++) {
			max = Math.max(max, Integer.parseInt(num[i]));
			min = Math.min(min, Integer.parseInt(num[i]));
		}
		System.out.println(min + " " + max);
	}
}