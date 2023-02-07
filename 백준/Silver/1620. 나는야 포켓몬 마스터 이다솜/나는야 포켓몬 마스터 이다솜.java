import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		HashMap<String, Integer> map1 = new HashMap<String, Integer>();
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < N; i++) {
			String a = br.readLine();
			map1.put(a,i+1);
			map2.put(i+1,a);
		}
		
		for(int i = 0; i < M; i++) {
			String a = br.readLine();
			//System.out.println(a);
			if(map1.containsKey(a))
				System.out.println(map1.get(a));
			else
				System.out.println(map2.get(Integer.parseInt(a)));
		}
		
	}
}