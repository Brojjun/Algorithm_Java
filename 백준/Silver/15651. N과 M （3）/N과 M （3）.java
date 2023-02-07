import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	static int N;
	static int M;
	static StringBuffer st = new StringBuffer();
	static List<Integer> numbers = new ArrayList<>();
	static boolean[] visited;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		visited = new boolean[N+2];
		makeNum(0);
		System.out.println(st);
	}

	private static void makeNum(int cnt) {
		// TODO Auto-generated method stub
		if(cnt == M) {
			for(int i = 0; i <numbers.size(); i++) {
				st.append(numbers.get(i)+ " ");
			}
			st.append("\n");
			return;
		}
		
		for(int i = 1; i <= N; i++) {
			//if(visited[i])continue;
			
			visited[i] = true;
			numbers.add(i);
			makeNum(cnt+1);
			numbers.remove(numbers.size()-1);
			visited[i] = false;
		}
	}
}
