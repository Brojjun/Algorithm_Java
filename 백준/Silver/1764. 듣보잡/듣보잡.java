import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Map<String, Integer> map = new HashMap<String, Integer>();
		Map<String, Integer> map2 = new TreeMap<String, Integer>();
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer fir = new StringTokenizer(br.readLine());
		int bn1 = Integer.parseInt(fir.nextToken());
		int bn2 = Integer.parseInt(fir.nextToken());
		
		for(int i = 0; i < bn1; i++) {
			map.put(br.readLine(), 0);
		}
		int cnt = 0;
		for(int i = 0;i < bn2; i++) {
			String s = br.readLine();
			if(map.containsKey(s)) {
				map2.put(s,0);
				cnt++;
			}
		}
		System.out.println(cnt);
		for(String key : map2.keySet()){
			System.out.println(key);
		}
	}
}