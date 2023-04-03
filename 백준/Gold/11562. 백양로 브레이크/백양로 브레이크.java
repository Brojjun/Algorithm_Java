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
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[][] map = new int[n+1][n+1];
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <=n; j++) {
				map[i][j] = Integer.MAX_VALUE / 3;
			}
		}
		
		for(int i = 0 ; i < m ; i++) {
			st = new StringTokenizer(br.readLine());
			int begin = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int goback = Integer.parseInt(st.nextToken());
			map[begin][end] = 0;
			if(goback == 1)map[end][begin] = 0;
			else map[end][begin] = 1;
		}
		
		for(int mid = 1; mid <= n; mid++) {
			for(int begin = 1; begin <= n; begin++) {
				for(int end = 1; end <= n; end++) {
					if(begin == end)map[begin][end] = 0;
					else map[begin][end] = Math.min(map[begin][end], map[begin][mid] + map[mid][end]);
				}
			}
		}
		int k = Integer.parseInt(br.readLine());
		for(int i = 0 ; i < k; i++) {
			st = new StringTokenizer(br.readLine());
			int begin = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			System.out.println(map[begin][end]);
		}
	}
}
