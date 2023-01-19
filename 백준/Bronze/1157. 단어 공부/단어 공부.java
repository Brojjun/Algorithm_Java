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
		int[] map = new int[27];

		for(int i = 0; i < word.length(); i++) {
			int a = word.charAt(i);
			if(a >= 'a') a -= 'a';
			else a -= 'A';
			map[a]++;
		}
		
		int max_data = -1;
		int max_at = -1;
		boolean check = false;
		for(int i = 0; i < 27; i++) {
			if(max_data < map[i]) {
				max_data = map[i];
				max_at = i;
				check = false;
			}
			else if(max_data == map[i]) {
				check = true;
			}
		}
		char la = (char)max_at;
		la += 'A';
		if(check)System.out.println("?");
		else
			System.out.print(la);
}
}