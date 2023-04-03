import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

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
		loop:
		for(int T=1; T <= test; T++) {
			int n = Integer.parseInt(br.readLine());
			Point map[] = new Point[n+3];
			for(int i = 1; i <= n+2; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				map[i] = new Point(y,x,i);
			}
			
			Queue<Point> que = new LinkedList<>();
			que.add(map[1]);

			boolean visit[] = new boolean[n+3];
			visit[1] = true;
			while(!que.isEmpty()) {
				int y = que.peek().y;
				int x = que.peek().x;
				int at = que.poll().at;
				if(at == n+2) {System.out.println("happy"); continue loop;}
				for(int i = 1; i <= n+2; i++) {
					if(visit[i])continue;
					int dis = Math.abs(y - map[i].y) + Math.abs(x - map[i].x);
					if(dis > 1000)continue;
					visit[i] = true;
					que.add(new Point(map[i].y, map[i].x, i));
				}
			}
			
			System.out.println("sad");
		}


	}
}
