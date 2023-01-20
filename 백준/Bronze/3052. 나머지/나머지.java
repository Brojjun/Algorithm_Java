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
		boolean[] numberMap = new boolean[43];
		
		int cnt = 0;
		//값 받아서 cnt++ (numbermap을 곁들인)
		for(int i = 0; i < 10; i++) {
			int n = Integer.parseInt(br.readLine());
			int modn = n % 42;
			
			
			if(!numberMap[modn]) {
				numberMap[modn] = true;
				cnt++;
			}
		}
		System.out.println(cnt);
	
		
	}
}