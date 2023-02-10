import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Map.Entry;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException{
		
		// TODO Auto-generated constructor stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int BN = Integer.parseInt(br.readLine());
	
		for(int i = 0; i < BN; i++) {
			int B = Integer.parseInt(br.readLine());
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			
			for(int j = 0; j < B; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				String name = st.nextToken();
				String type = st.nextToken();
				
				map.put(type, map.getOrDefault(type, 0) + 1);
			}
			
			int num = 1;
			for(Entry<String, Integer> b : map.entrySet()) {
				num *= (b.getValue()+1);
			}
			if(map.size() == 1)System.out.println(B);
			else System.out.println(num - 1);
			
		}
	}
	

}