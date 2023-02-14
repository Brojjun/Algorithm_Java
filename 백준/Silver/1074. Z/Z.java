import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int cnt = 0;
	static int N;
	static int Y;
	static int X;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		Y = Integer.parseInt(st.nextToken());
		X = Integer.parseInt(st.nextToken());

		dfs(0,0,N);

	}
	private static void dfs(int y, int x, int n) {
		int Bn = 1 << n;
		if(y == Y && x == X) {
			System.out.println(cnt);
			return;
		}
		
		else if(n == 0) {
			++cnt;
			return;
		}
		

		else if((Y > y+Bn || Y < y) && (X > x+Bn || X < x)) {
			cnt += Bn * Bn;
			return;
		}
		
		else {

			dfs(y,x,n-1);
			dfs(y,x+(Bn/2),n-1);
			dfs(y+(Bn/2), x,n-1);
			dfs(y+(Bn/2),x+(Bn/2),n-1);
		}
		
	}
	
	
		
	
}
