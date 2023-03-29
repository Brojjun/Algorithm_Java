import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int bn;
	static int[][] map;
	static int[][] memo;
	static int minDis = Integer.MAX_VALUE;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		bn = Integer.parseInt(br.readLine());
		map = new int[bn][bn];
		memo = new int[bn][1<<bn];
		for(int i = 0; i < bn; i++) {
			for(int j = 0; j < 1<<bn; j++)memo[i][j] = minDis;
			StringTokenizer st= new StringTokenizer(br.readLine());
			for(int j = 0; j < bn; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		//1번부터 방문
		memo[0][1] = 0;
		tsp(0,1);
		System.out.println(minDis);
	}

	private static void tsp(int now, int visited) {
		//기져조건 => 전부 순회 완료시
		if(visited == ((1<<bn)-1)) {
			if(map[now][0] == 0) return; // 출발지로 돌아가는 경로가 없을 경우 무효
			int distance = memo[now][visited] + map[now][0]; // 돌아오는 경로를 더한 값
			minDis = Math.min(minDis, distance);
			return;
		}
	
		
		//dfs로 경로 탐색
		for(int i = 0 ; i < bn; i++) {
			int next = 1<<i;
			if((visited | next) == visited || map[now][i] == 0) continue;
			//시작-여태까디 들린거->i까지 가는 경로 vs 시작-여태까지 들린거->next 경로 전에 저장한거
			//				내가 만든 경로        vs     기존에 만든 경로
			if(memo[now][visited] + map[now][i] < memo[i][visited|next]) {
				memo[i][visited|next] = memo[now][visited] + map[now][i];
				tsp(i, visited|next);
			}
		}
	}
}
