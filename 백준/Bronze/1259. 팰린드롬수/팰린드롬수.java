import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

/*
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String[] yxbag = br.readLine().split(" ");

int by = Integer.parseInt(yxbag[0]);
int bx = Integer.parseInt(yxbag[1]);
int bag = Integer.parseInt(yxbag[2]);

 */

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int i = 0;
		outerloop:
		while(true) {
		String a = br.readLine();
		if(a.equals("0"))
			break;
		
		int start = 0;
		int last = a.length() - 1;
		
		while(start < last) {
			//System.out.println(a.charAt(start) + " : " + a.charAt(last));
			if(a.charAt(start) != a.charAt(last)) {
				System.out.println("no");
				continue outerloop;
			}
			start++;
			last--;
		}
		System.out.println("yes");
		}
		
	}
}