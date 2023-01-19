import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
		String word = br.readLine();
		
		word = word.trim();
		
		if(word.length() == 0)
			System.out.println("0");
		
		else {
			String[] words = word.split(" ");
			System.out.println(words.length);
		}
		
}
}