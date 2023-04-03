import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int memo[][] = new int[n + 1][n + 1];
		int map[][] = new int[n + 1][n + 1];

		for (int i = 1; i <= n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= n; j++) {
				memo[i][j] = map[i][j] = Integer.parseInt(st.nextToken());
				
			}
		}

		for (int mid = 1; mid <= n; mid++) {
			for (int begin = 1; begin <= n; begin++) {
				for (int end = 1; end <= n; end++) {

					if (begin == mid || mid == end || begin == end)
						continue;

					if (map[begin][end] == map[begin][mid] + map[mid][end]) 
						memo[begin][end] = 0;
					
					if (map[begin][end] > map[begin][mid] + map[mid][end]) {
							System.out.println("-1");
							return;
					}
				}
			}
		}

		int add = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				add += memo[i][j];
			}
		}

		System.out.println(add / 2);

	}
}
