import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Map<String,String> map = new HashMap<String, String>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer in = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(in.nextToken());
		int M = Integer.parseInt(in.nextToken());
		for(int i = 0; i < N; i++) {
			StringTokenizer in2 = new StringTokenizer(br.readLine());
			map.put(in2.nextToken(), in2.nextToken());
		}
		for(int i = 0; i < M; i++) {
			System.out.println(map.get(br.readLine()));
		}
	}
}