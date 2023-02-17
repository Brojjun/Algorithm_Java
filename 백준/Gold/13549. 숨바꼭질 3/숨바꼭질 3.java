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
import java.util.Scanner;
import java.util.StringTokenizer;

class P implements Comparable<P>{
	int m;
	int cnt;
	public P(int m, int cnt) {
		super();
		this.m = m;
		this.cnt = cnt;
	}
	@Override
	public int compareTo(P o) {
		// TODO Auto-generated method stub
		return this.cnt - o.cnt;
	}
}

public class Main {
	static int mincnt = Integer.MAX_VALUE;
	static int me;
	static int you;
	static boolean[] visit = new boolean[100001];
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		me = sc.nextInt();
		you = sc.nextInt();
		
		move();

		System.out.println(mincnt);
	}
	private static void move() {
		PriorityQueue<P>arr = new PriorityQueue<>();
		
		arr.add(new P(me,0));
		
		while(!arr.isEmpty()) {
			P now = arr.poll();
			
			if(visit[now.m])continue;
			if(now.cnt > mincnt)continue;
			if(now.m == you) {mincnt = now.cnt; break;}
			
			
			visit[now.m] = true;
			if(now.m+1 <= 100000 && !visit[now.m+1])
				arr.add(new P(now.m+1, now.cnt+1));
			if(now.m - 1 >= 0 && !visit[now.m-1])
				arr.add(new P(now.m-1, now.cnt+1));
			if(now.m * 2 <= 100000  && !visit[now.m*2])
				arr.add(new P(now.m*2, now.cnt));
		}
		
	}
}
