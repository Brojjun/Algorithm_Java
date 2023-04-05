import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main {

	static class Point{
	int num,time;
	
	}
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		for(int T = 1; T <= test; T++) 
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			int number[] = new int[n+1];
			int time[] = new int[n+1];
			int fix[] = new int[n+1];
			
			st = new StringTokenizer(br.readLine());
			for(int i = 1; i <= n; i++)fix[i] = Integer.parseInt(st.nextToken());
			
			List<Integer>[]next = new ArrayList[n+1];
			List<Integer>[]prev = new ArrayList[n+1];
			for(int i = 0; i <= n; i++)prev[i] = new ArrayList<>();
			for(int i = 0; i <= n; i++)next[i] = new ArrayList<>();
			
			for(int i = 0; i < m; i++) {
				st = new StringTokenizer(br.readLine());
				int begin = Integer.parseInt(st.nextToken());
				int end = Integer.parseInt(st.nextToken());
				number[end]++;
				next[begin].add(end);
				prev[end].add(begin);
			}
			
			int lastNum = Integer.parseInt(br.readLine());
			Queue<Integer>que = new LinkedList<>();
			for(int i = 1; i <= n; i++) if(number[i] == 0) { que.add(i);number[i] = -1;}
			
			while(!que.isEmpty()) {
				int now = que.poll();
				
				int maxt = 0;
				
				for(int px : prev[now]) {
					maxt = Math.max(maxt, time[px]);
				}
				time[now] = maxt + fix[now];
				
				if(now == lastNum) {break;}
					
				for(int nx : next[now]) {
					number[nx]--;
				}
				
				for(int i = 1; i <= n; i++) if(number[i] == 0) { que.add(i); number[i] = -1;}
			}
			System.out.println(time[lastNum]);
			//for(int i =1 ; i <= n ; i++)System.out.print(time[i] + " ");
		}
	}	
	
}
