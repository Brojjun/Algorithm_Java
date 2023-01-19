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
		StringBuffer sb = new StringBuffer();
		String[] num_s = br.readLine().split(" ");
		
		//string 상태에서 숫자 뒤집고 -> int 형변환후 비교
		num_s[0] = new StringBuffer(num_s[0]).reverse().toString();
		num_s[1] = new StringBuffer(num_s[1]).reverse().toString();
		
		System.out.println(Math.max(Integer.parseInt(num_s[0]), Integer.parseInt(num_s[1])));
		
		
	
	}
}