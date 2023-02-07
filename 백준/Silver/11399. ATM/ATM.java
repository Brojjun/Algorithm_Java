import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		StringTokenizer num = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(num.nextToken());
		
		Arrays.sort(arr);
		int time = arr[0];
		for(int i = 1; i < N; i++) {
			arr[i] = arr[i] + arr[i-1];
			time += arr[i];
		}
		System.out.println(time);
		
	}
}