import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int bn, bm;
	static long map[][];
	static long memo[][];

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		bn = Integer.parseInt(br.readLine());
		bm = Integer.parseInt(br.readLine());
		map = new long[bn + 1][bn + 1];
		memo = new long[bn + 1][bn + 1];

		for (int i = 1; i <= bm; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int begin = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int value = Integer.parseInt(st.nextToken());
			if (map[begin][end] != 0)
				map[begin][end] = Math.min(value, map[begin][end]);
			else
				map[begin][end] = value;

		}

		for (int i = 1; i <= bn; i++) {
			for (int j = 1; j <= bn; j++) {
				if (i == j)
					memo[i][j] = 0;
				else if (map[i][j] == 0)
					memo[i][j] = Integer.MAX_VALUE;
				else
					memo[i][j] = map[i][j];

			}
		}
		for (int mid = 1; mid <= bn; mid++) {
			for (int begin = 1; begin <= bn; begin++) {
				for (int end = 1; end <= bn; end++) {
					if (memo[begin][mid] != Integer.MAX_VALUE && memo[mid][end] != Integer.MAX_VALUE)
						if (memo[begin][end] > memo[begin][mid] + memo[mid][end]) {
							memo[begin][end] = memo[begin][mid] + memo[mid][end];
						}
				}
			}
		}

		for (int i = 1; i <= bn; i++) {
			for (int j = 1; j <= bn; j++) {
				System.out.print((memo[i][j] == Integer.MAX_VALUE ? "0":memo[i][j]) + " ");
			}
			System.out.println();
		}

	}
}
