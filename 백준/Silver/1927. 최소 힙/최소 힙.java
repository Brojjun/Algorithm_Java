import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		PriorityQueue<Integer> arr = new PriorityQueue<>();
		int N = Integer.parseInt(br.readLine());
	
		for(int i = 0; i < N; i++) {
			int n = Integer.parseInt(br.readLine());
			if(n == 0) {
				if(arr.isEmpty())System.out.println(0);
				else
					System.out.println(arr.poll());
			}
			
			else{
				arr.add(n);
			}
			
		}

	}
	
	
		
	
}
