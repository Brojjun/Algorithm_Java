import java.util.Scanner;

public class Main {
	static public int N;
	static public int R;
	static public int[] numbers;
	static public boolean[] visited;
	static public StringBuffer out = new StringBuffer();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		R = sc.nextInt();
		
		numbers = new int[R];
		visited = new boolean[N + 1];
		makeNum(0, 1 );
		out.delete(out.length()-2, out.length());
		System.out.println(out.toString());
	}

	private static void makeNum(int cnt, int start) {
		// TODO Auto-generated method stub
		if(cnt == R) {
			for(int i = 0; i < R; i++) {
				out.append(numbers[i] + " ");
			}
			out.append("\n");
			return;
		}
		for(int i = start; i <= N; i++) {
			//if(visited[i])continue;
			//visited[i] = true;
			numbers[cnt] = i;
			makeNum(cnt+1, i);
			numbers[cnt] = 0;
			//visited[i] = false;
		}
	}
}
