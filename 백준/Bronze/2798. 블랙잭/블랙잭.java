	
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;
import java.util.Scanner;
		
	public class Main {

		
		static int allcard[];
		static int max_num = 0;
		static int max_data = 0;
		static boolean visited[];
		
		public static void findTripleCard(int cnt, int[] card){
			if(cnt >= 3) {
				int imcard = card[0] +card[1] + card[2];
				if(imcard <= max_num && imcard <= max_num)
					max_data = Math.max(max_data, imcard);
				return;
			}
			
			for(int i = 0; i < allcard.length; i++) {
				if(visited[i])continue;
				else {
					card[cnt] = allcard[i];
					visited[i] = true;
					
					findTripleCard(cnt+1, card);
					visited[i] = false;
					card[cnt] = 0;
				}
			}
			
		}
		
		public static void main(String[] args) throws Exception {
			
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			max_num = sc.nextInt();
			int[] imm = new int[n];
			for(int i = 0; i < n; i++) imm[i] = sc.nextInt();
			allcard = imm;
			visited = new boolean[n];
			findTripleCard(0, new int[3]);
			System.out.println(max_data);
			
			
		}
			
	
			
}		
	

	
	