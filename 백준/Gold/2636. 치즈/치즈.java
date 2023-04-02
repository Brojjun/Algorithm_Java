
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static class Point {
		int y, x;

		public Point(int y, int x) {
			super();
			this.y = y;
			this.x = x;
		}

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int by, bx;
		StringTokenizer st = new StringTokenizer(br.readLine());
		by = Integer.parseInt(st.nextToken());
		bx = Integer.parseInt(st.nextToken());
		int map[][] = new int[by][bx];

		for (int i = 0; i < by; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < bx; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		List<List<Point>> arr = new ArrayList<>();

		int dx[] = { -1, 1, 0, 0 };
		int dy[] = { 0, 0, 1, -1 };
		arr.add(new ArrayList<>());

		ArrayList<Integer> timezone = new ArrayList<>();
		ArrayList<Point> imm = new ArrayList<>();
		for (int i = 0; i < by; i++) {
			imm.add(new Point(i, 0));
			imm.add(new Point(by - i - 1, 0));
		}
		for (int i = 0; i < bx; i++) {
			imm.add(new Point(0, i));
			imm.add(new Point(0, bx - i - 0));
		}
		int cnt = 10;
		int time = 0;
		
		while (true) {
			if(cnt == 0)break;
			cnt = 0;
			Queue<Point> que = new LinkedList<>();
			Queue<Point> que2 = new LinkedList<>();
			boolean visit[][] = new boolean[by][bx];

			for (Point now : imm)
				que.add(now);
			while (!que.isEmpty()) {
				int y = que.peek().y;
				int x = que.poll().x;
				for (int i = 0; i < 4; i++) {
					int ny = y + dy[i];
					int nx = x + dx[i];
					if (ny < 0 || nx < 0 || ny >= by || nx >= bx)
						continue;
					if (visit[ny][nx] || map[ny][nx] == 1)
						continue;
					que.add(new Point(ny, nx));
					que2.add(new Point(ny, nx));
					visit[ny][nx] = true;
				}
			}

			while (!que2.isEmpty()) {
				Point now = que2.poll();
				for (int i = 0; i < 4; i++) {
					int ny = now.y + dy[i];
					int nx = now.x + dx[i];
					if (ny < 0 || nx < 0 || ny >= by || nx >= bx)
						continue;
					if (map[ny][nx] == 1) {
						map[ny][nx] = 0;
						cnt++;
					}
				}
			}

			timezone.add(cnt);
			time++;
		}
		System.out.println(time-1);
		System.out.println(timezone.get(time-2));
	}
}
