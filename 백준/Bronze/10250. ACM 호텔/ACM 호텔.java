	
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.math.BigInteger;
import java.util.Arrays;
	
	
	/*
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String[] yxbag = br.readLine().split(" ");
	
	 */
	
	public class Main {
			
		public static void main(String[] args) throws Exception {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int test_cnt = Integer.parseInt(br.readLine());
			for(int i = 0; i < test_cnt; i++) {
				//input [high, width, people]
				String[] immap = br.readLine().split(" ");
				int[] num = {Integer.parseInt(immap[0]), Integer.parseInt(immap[1]), Integer.parseInt(immap[2])};
				
				int high = num[2] % num[0];
				
				int width = (num[2] / num[0]) + 1;
				
				if(high == 0) {high = num[0]; width--;}
				String room = Integer.toString(high);;
				
				if(width < 10)	room += "0";
				room += Integer.toString(width);
				
				
				

				
				System.out.println(room);
			}
		
			
				
		}

		private static Reader InputStreamReader(InputStream in) {
			// TODO Auto-generated method stub
			return null;
		}
	}