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
		
		int n = Integer.parseInt(br.readLine());
		String[] words = new String[n];
		for(int i = 0 ; i < n; i++) words[i] = br.readLine();
	
		for(int i = 0 ; i < n; i++) {
			int cnt = 1;
			int score = 0;
			for(int j = 0; j < words[i].length(); j++) {
				if(words[i].charAt(j) == 'O') score += (cnt++);
				else cnt = 1;
			}
			System.out.println(score);
		}
		

		
	}
}