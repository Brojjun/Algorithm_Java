import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	static public int N;
	static public int R;
	static public int[] input;
	static public int[] numbers;
	static public boolean[] visited;
	static public StringBuffer out = new StringBuffer();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		R = sc.nextInt();
		
		input = new int[N];
		for(int i = 0; i < N; i++) {
			input[i] = sc.nextInt();
		}
		Arrays.sort(input);
		numbers = new int[R];
		visited = new boolean[N + 1];
		makeNum(0);
		out.delete(out.length()-2, out.length());
		System.out.println(out.toString());
	}

	private static void makeNum(int cnt) {
		// TODO Auto-generated method stub
		if(cnt == R) {
			for(int i = 0; i < R; i++) {
				out.append(numbers[i] + " ");
			}
			out.append("\n");
			return;
		}
		for(int i = 0; i < N; i++) {
			if(visited[i])continue;
			visited[i] = true;
			numbers[cnt] = input[i];
			makeNum(cnt+1);
			numbers[cnt] = 0;
			visited[i] = false;
		}
	}
}
