import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder("<");
		Queue<Integer> que = new LinkedList<>();
		
		int k = sc.nextInt();
		int n = sc.nextInt();
		for(int i = 1; i <= k; i++)que.add(i);
		while(!que.isEmpty()) {
			for(int i = 0; i < n-1; i++) {
				int im = que.poll();
				que.add(im);
			}
			sb.append(que.poll()+", ");
			
		}
		sb.setLength(sb.length()-2);
		sb.append(">");
		System.out.println(sb.toString());
	}
}


