import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;



public class Main {
	static LinkedList<Integer>[] node;
	static int cnt[];

	static int nt = 0;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int bn = Integer.parseInt(st.nextToken());
		int bm = Integer.parseInt(st.nextToken());
		node = new LinkedList[bn+1];
		cnt = new int[bn+1];
		
		for(int i = 1; i <= bn; i++) node[i]=new LinkedList<>();
		for(int i = 0 ; i < bm; i++) {
			st = new StringTokenizer(br.readLine());
			int next = Integer.parseInt(st.nextToken());
			int me = Integer.parseInt(st.nextToken());
			node[next].add(me);
			cnt[me]++;
		}
	
		Queue<Integer> que = new LinkedList<>();
		for(int i = 1; i <= bn; i++) {
			if(cnt[i] == 0) {
				cnt[i] = -1;
				que.add(i);
			}
		}
		
		while(!que.isEmpty()) {
			int current = que.poll();
			sb.append(current + " ");

			for(int j : node[current]) {
				cnt[j]--;
				if(cnt[j] == 0) que.add(j);
			}
		}
	

		System.out.print(sb.toString());

	}

}
