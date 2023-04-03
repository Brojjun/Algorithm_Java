import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int bn, bk, bm;
	static int map[][];
	static int memo[][];

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		bn = Integer.parseInt(st.nextToken());
		bk = Integer.parseInt(st.nextToken());
		map = new int[bn+1][bn+1];
		
		for(int i = 1; i <= bk; i++) {
			st = new StringTokenizer(br.readLine());
			int begin = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			map[begin][end] = -1;
			map[end][begin] = 1;
		}
		
		for(int mid = 1; mid <= bn; mid++) {
			for(int begin = 1; begin <= bn; begin++) {
				for(int end = 1; end <= bn; end++) {
					if(map[begin][end] == 1 || map[begin][end] == -1)continue;
					
					if(map[begin][mid] == 1 && map[mid][end] == 1) {
						map[begin][end] = 1;
						map[end][begin] = -1;
					}
					else if(map[begin][mid] == -1 && map[mid][end] == -1) {
						map[begin][end] = -1;
						map[end][begin] = 1;
					}
				}
			}
		}
		
		bm = Integer.parseInt(br.readLine());
		for(int i = 0; i < bm; i++) {
			st = new StringTokenizer(br.readLine());
			int begin = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			System.out.println(map[begin][end]);
		}


	}
}
