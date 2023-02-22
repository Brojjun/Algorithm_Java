import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

class Point{
	int y;
	int x;
	
	public Point(int y, int x) {
		super();
		this.y = y;
		this.x = x;
	}
	
}
public class Main {
		static int[] dy = {-1,0,1};
	static int by,bx, cnt;
	static String map[][];
	static boolean visit[][];
	static boolean vvisit[][];
	static boolean flag = false;
	static StringBuffer sb = new StringBuffer();
	static Queue<Point> que = new LinkedList<Point>();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		by = Integer.parseInt(st.nextToken());
		bx = Integer.parseInt(st.nextToken());
		map = new String[by][bx];
		
		for(int i = 0; i < by; i++) map[i] = br.readLine().split("");
		
		visit = new boolean[by][bx];
		
		for(int i = 0; i < by; i++) {
			visit[i][0] = true;
			
			flag = false;
			play(i,0);
			
		}
		
		System.out.println(cnt);
	}
	private static void play(int y, int x) {
		if(flag)return;
		
		if(x == bx-1) {
			visit[y][x] = true;
			cnt++;			
			flag = true;
			return;
		}
		
		
		for(int i = 0; i < 3; i++) {
			if(flag)return;
			int nx = x + 1;
			int ny = y + dy[i];
			
			if(nx < 0 || ny < 0 || nx >= bx || ny >= by) continue;
			if( visit[ny][nx]) continue;
			if(map[ny][nx].equals("x")) continue;
			visit[ny][nx] = true;
			play(ny,nx);
			
		}
		
			
		
		
	}
}
