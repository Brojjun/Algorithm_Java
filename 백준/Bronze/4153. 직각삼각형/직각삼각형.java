	
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
			
			while(true) {
				//input
				String[] map = br.readLine().split(" ");
				int[] number = {Integer.parseInt(map[0]),Integer.parseInt(map[1]),Integer.parseInt(map[2])};
				
				if(number[0] == 0 && number[1] == 0 && number[2] == 0)break;
				
				Arrays.sort(number);
				//System.out.println(Arrays.toString(number));
				if((number[0] * number[0]) + (number[1] * number[1]) == (number[2] * number[2])) System.out.println("right");
				else System.out.println("wrong");
			}
		
			
				
		}

		private static Reader InputStreamReader(InputStream in) {
			// TODO Auto-generated method stub
			return null;
		}
	}