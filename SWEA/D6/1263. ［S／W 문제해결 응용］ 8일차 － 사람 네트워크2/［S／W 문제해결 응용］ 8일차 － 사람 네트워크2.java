import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution {

static class Point{
	int y,x, at;

	public Point(int y, int x, int at) {
		super();
		this.y = y;
		this.x = x;
		this.at = at;
		
	}
}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		for(int T = 1; T <= test; T++) 
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int map[][] = new int[n+1][n+1];
			for(int y = 1; y <= n; y++) {
				for(int x = 1; x <=n; x++) {
					map[y][x] = Integer.parseInt(st.nextToken());
				}
			}
			
			for(int mid = 1; mid <= n; mid++) {
				for(int begin = 1; begin <= n; begin++) {
					for(int end = 1; end <= n; end++) {
						if(begin == end || mid == begin || mid == end)continue;
						if(map[begin][mid] != 0 && map[mid][end] != 0) {
							if(map[begin][end] == 0)map[begin][end] = map[begin][mid] + map[mid][end];
							else map[begin][end] = Math.min(map[begin][end], map[begin][mid] + map[mid][end]);
						}
					}
				}
			}
			
			int[] minMap = new int[n+1];
			for(int i = 1; i <= n; i++) {
				for(int j = 1; j <= n; j++) {
					minMap[i] += map[i][j];
//					System.out.print(map[i][j] + " ");
				}
//				System.out.println();
			}
			int min = Integer.MAX_VALUE;
			for(int i = 1; i<=n; i++)min = Math.min(min, minMap[i]);
			System.out.println("#"+T+" "+min);
		}
		
		
	}
}
