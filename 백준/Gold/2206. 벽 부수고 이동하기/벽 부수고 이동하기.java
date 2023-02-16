import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

class Point {
	int y;
	int x;
	int time;
	int attack;

	public Point(int y, int x, int time, int attack) {
		super();
		this.y = y;
		this.x = x;
		this.time = time;
		this.attack = attack;
	}

}

public class Main {
	static int N;
	static int M;
	static int[][] map;
	static int[][][] vmap;
	static int cnt = 0;
	static int dx[] = { -1, 0, 1, 0 };
	static int dy[] = { 0, 1, 0, -1 };

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		map = new int[N][M];
		vmap = new int[N][M][2];
		
		for (int i = 0; i < N; i++) {
			String im = br.readLine();
			for (int j = 0; j < M; j++) {
				map[i][j] = im.charAt(j) - '0';
			}
		}
		
		System.out.println(bfs());
		
//		for (int i = 0; i < N; i++) {
//		
//			for (int j = 0; j < M; j++) {
//				System.out.print(vmap[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		

	}

	private static int bfs() {
		Queue<Point> arr = new LinkedList<>();
		arr.add(new Point(0, 0, 1, 1));
		vmap[0][0][0] = 1;
		if(N-1 == 0 && M -1 == 0)return 1;
		int cnt = 1;
		while (!arr.isEmpty()) {
			Point now = arr.poll();
			int x = now.x;
			int y = now.y;
			int t = now.time;
			int a = now.attack;
			
			for (int i = 0; i < 4; i++) {
				int nx = x +dx[i];
				int ny = y +dy[i];
				int nt = t + 1;
				
								
				if (ny < 0 || nx < 0 || nx >= M || ny >= N)
					continue;
				
				if (vmap[ny][nx][a] > 0)
					continue;
				
				if (ny == N - 1 && nx == M - 1)
					return nt;
				
				if (map[ny][nx] == 1) {
					if (a == 1) {
						vmap[ny][nx][a] = nt;
						arr.add(new Point(ny,nx,nt,0));
					}
					continue;
				}
				
				vmap[ny][nx][a] = nt;
				arr.add(new Point(ny,nx,nt,a));
				
			}
		}

		return -1;
	}

}
