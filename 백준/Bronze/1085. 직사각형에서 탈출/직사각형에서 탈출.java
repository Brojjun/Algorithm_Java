	
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
			//input
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String[] in = br.readLine().split(" ");
		
			// 0 : x , 1 : y , 2 : w , 3 : h
			int x = Math.min(Integer.parseInt(in[0]), Integer.parseInt(in[2]) - Integer.parseInt(in[0]));
			int y = Math.min(Integer.parseInt(in[1]), Integer.parseInt(in[3]) - Integer.parseInt(in[1]));
			System.out.println(Math.min(y,x)
					);
		}

		private static Reader InputStreamReader(InputStream in) {
			// TODO Auto-generated method stub
			return null;
		}
	}