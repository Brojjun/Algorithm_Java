import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer a = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(a.nextToken());
		int M = Integer.parseInt(a.nextToken());
		
		List <Integer> arr = new ArrayList<>();
		
		for(int i = 0; i < N; i++) arr.add(Integer.parseInt(br.readLine()));
		
		Collections.sort(arr);
		int cnt = 0;
		while(M > 0) {
			int money = 0;
			for(int i = arr.size()-1; i >= 0; i--) {
				if(M >= arr.get(i)) {
					money = Math.max(money,arr.get(i));
				}
			}
			//System.out.println(money);
			M -= money;
			cnt++;
		}
		System.out.println(cnt);
			
		
		
	}
}