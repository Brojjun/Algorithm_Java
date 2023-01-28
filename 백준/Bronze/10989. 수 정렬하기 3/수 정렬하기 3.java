import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated constructor stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] map = new int[10001];

		for (int i = 0; i < n; i++)
			map[Integer.parseInt(br.readLine())]++;

		StringBuilder sb = new StringBuilder();
		
		for (int i = 1; i < 10001; i++) {
			while (map[i] > 0) {
				sb.append(i + "\n");
				map[i]--;
			}
		}
		System.out.println(sb);
	}
}
