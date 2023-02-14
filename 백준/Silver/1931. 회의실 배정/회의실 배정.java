import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;


class Point implements Comparable<Point>{
	int start;
	public Point(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}

	int end;
	


	@Override
	public int compareTo(Point o) {
		if(this.end == o.end)return this.start - o.start;
		return this.end - o.end;
	}


}

public class Main {



	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt = 0;
		int N = Integer.parseInt(br.readLine());
		Point[] map = new Point[N];
		
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			map[i] = new Point(n,m);
		}
		
	
		Arrays.sort(map);

		int end = 0;
		
		
		for(int i = 0; i < N; i++) {
			if(end <= map[i].start) {
				cnt++;
				end = map[i].end;
			}
			
		}
		System.out.println(cnt);
	}
	
	
		
	
}
