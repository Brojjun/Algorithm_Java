import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int BN = Integer.parseInt(br.readLine());
		int[] dal = new int[BN];
		int[] sin = new int[BN];
		
		for(int i = 0; i < BN; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			sin[i] = Integer.parseInt(st.nextToken());
			dal[i] = Integer.parseInt(st.nextToken());
		}
		
		int greatCook = Integer.MAX_VALUE;
		for(int i = 1; i < (1 << BN); i++) {
			int sinSum = 1;
			int dalSum = 0;
			for(int j = 0; j < BN; j++) {
				if((i & (1 << j)) == 0) continue;
				sinSum *= sin[j];
				dalSum += dal[j];
			}
			greatCook = Math.min(greatCook, Math.abs(sinSum - dalSum));
		}
		System.out.println(greatCook);
	}
}
