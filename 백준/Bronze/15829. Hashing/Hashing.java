import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int length = Integer.parseInt(br.readLine());
		String[] arr = br.readLine().split("");
		long md = 1234567891;
		long result = 0;
		
		for(int i = 0,r = 1 ; i < length; i++, r *= 31) {
			r %= md;
			result = (result % md) + (((int)(arr[i].charAt(0) - 'a' + 1) % md) * r) % md;
		}
		
		System.out.println(result % md);
		
	}
}
