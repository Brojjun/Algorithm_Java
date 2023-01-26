	
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.math.BigInteger;
import java.util.Arrays;
		
	public class Main {
		public static void main(String[] args) throws Exception {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int num = Integer.parseInt(br.readLine());
			
			for(int i=1; i<num; i++) {
				int mergenum = i;
				int immNum = i;
				
				while(immNum > 0) {
					mergenum += (immNum % 10);
			
					immNum /= 10;
				}
				if(mergenum == num) {
					System.out.println(i);
					return;
				}
			}
			System.out.println(0);
		}
			
	
			
}		
	

	
	