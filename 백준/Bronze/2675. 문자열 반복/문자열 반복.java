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
		String[][] words = new String[1001][30];
		words[0][0] = br.readLine();
		int test_num = Integer.parseInt(words[0][0]);

		for (int test_cnt = 1; test_cnt <= test_num; test_cnt++)
			words[test_cnt] = br.readLine().split(" ");

		for (int test_cnt = 1; test_cnt <= test_num; test_cnt++) {
	
			for (int len = 0; len < words[test_cnt][1].length(); len++) {
				
				int word_num = Integer.parseInt(words[test_cnt][0]);
				for (int word_cnt = 0; word_cnt < word_num; word_cnt++) {
					System.out.print(words[test_cnt][1].charAt(len));
				}
			
			}
			System.out.println();
		}

	}
}