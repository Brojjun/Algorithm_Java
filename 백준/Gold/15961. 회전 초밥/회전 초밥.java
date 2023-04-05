import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static class Point {
		int num, time;

	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n, d, k, c;
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		d = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());

		int[] list = new int[n];
		int[] cnt = new int[n];
		for(int i = 0; i < n; i++)list[i] = Integer.parseInt(br.readLine());
		int[] visit = new int[d + 1];
		HashSet<Integer> set = new HashSet<>();
		set.add(c);
		visit[c]++;

		for (int i = n - k + 1; i < n; i++) {
			set.add(list[i]);
			visit[list[i]]++;
		}

		int time = 0;
		while (time < n) {
			set.add(list[time]);
			visit[list[time]]++;

			cnt[time] = set.size();
			time++;
			int per = time - k;
			
			if (per < 0) per = per + n;
			if (list[per] == c) continue;
			if (visit[list[per]] == 1)
				set.remove(list[per]);
			
			visit[list[per]]--;

		}

		int max = 0;
		for (int i = 0; i < n; i++) {
			max = Math.max(max, cnt[i]);
		}
		System.out.println(max);
	}
}
