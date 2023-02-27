import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	static int[] number;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		
		int T = Integer.parseInt(br.readLine());
		for(int t = 1; t <= T; t++) {
			sb.append("#" + t + " ");
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			make(N);
			for(int i = 0 ; i < M; i++) {
				st = new StringTokenizer(br.readLine());
				int what = Integer.parseInt(st.nextToken());
				int head = Integer.parseInt(st.nextToken());
				int tail = Integer.parseInt(st.nextToken());
				if(what == 0) {
					union(head,tail);
				}
				else if(what == 1) {
					if(find(head) == find(tail)) sb.append("1");
					else sb.append("0");
				}
			}
			sb.append("\n");
		}
		sb.delete(sb.length()-1, sb.length());
		System.out.println(sb.toString());
		
	}

	private static boolean union(int head, int tail) {
		int headRoot = find(head);
		int tailRoot = find(tail);
		
		if(headRoot == tailRoot)return false;
		number[tailRoot] = headRoot;
		return true;
	}

	private static int find(int head) {
		if(number[head] == head)return head;
		return number[head] = find(number[head]);
	}

	private static void make(int n) {
		number = new int[n+1];
		for(int i = 0 ; i <= n; i++)number[i]=i;
	}
}
