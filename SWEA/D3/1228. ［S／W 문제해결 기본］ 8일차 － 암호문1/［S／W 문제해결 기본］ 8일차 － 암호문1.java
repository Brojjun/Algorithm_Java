import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int test = 1; test <= 10; test++) {
			StringBuilder sb = new StringBuilder();
			LinkedList<Integer> arr = new LinkedList<>();
			
			String inputdatac = br.readLine();
			
			StringTokenizer st = new StringTokenizer(br.readLine());

			while (st.hasMoreTokens())
				arr.add(Integer.parseInt(st.nextToken()));

			inputdatac = br.readLine();
			
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			
			while (st1.hasMoreElements()) {
				String a = st1.nextToken();
				int n = Integer.parseInt(st1.nextToken());
				int m = Integer.parseInt(st1.nextToken());
				LinkedList<Integer> arr2 = new LinkedList<>();
				for (int i = 0; i < m; i++) {
					arr2.add(Integer.parseInt(st1.nextToken()));
				}
				arr.addAll(n, arr2);

			}
			
			for(int i = 0; i < 10; i++) {sb.append(arr.pop() + " ");}
			System.out.println("#" + test + " " + sb.toString());
		}
	}

}