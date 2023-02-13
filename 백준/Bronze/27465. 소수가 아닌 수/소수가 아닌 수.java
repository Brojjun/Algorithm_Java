import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long i = n+1;
		while(isPrime(i)) {i++;}
		System.out.println(i);
	}
	
	 public static boolean isPrime(long num) {
	        if (num < 2) 
	            return false;
	        
	        for (int i = 2; i <= Math.sqrt(num); i++) 
	            if (num % i == 0) return false;
	        
	        return true;
	    }
	
}