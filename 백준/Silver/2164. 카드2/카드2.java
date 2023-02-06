import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder("<");
		Queue<Integer> que = new LinkedList<>();

		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) que.add(i);
		
		int a = 0;
		while(!que.isEmpty()) {
			if(que.size() == 1) {
				a = que.poll();
				break;
			}
			
			que.remove();
			a = que.poll();
			que.add(a);
		}

		System.out.println(a);
	}
}


