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
			String a = br.readLine();
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for (int i = 0; i < 8; i++)arr.add(Integer.parseInt(st.nextToken()));
			
			outerloop:
			while (true) {
				
				for (int i = 1; i <= 5; i++) {
					int imm = arr.pop() - i;
					
					if (imm <= 0) {
						arr.addLast(0);
						for (int b = 0; b < 8; b++)
							sb.append(arr.get(b).toString() + " ");
						break outerloop;
					}
					
					
					arr.addLast(imm);
					

				}

			}
			System.out.println("#" + test + " " + sb.toString());
		}
	}

}