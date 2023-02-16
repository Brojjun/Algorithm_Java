import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;



public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int [][]map= new int[n][n];
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j <= i; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		for(int i = 1; i < n; i++) {
			for(int j = 0; j <= i; j++) {
				if(j==0)map[i][j] += map[i-1][j];
				else if (j==n-1)map[i][j] += map[i-1][j-1];
				else map[i][j] = map[i][j] + Math.max(map[i-1][j-1], map[i-1][j]);
			}
		}
		int cnt = 0;
		for(int i = 0; i < n; i++) {
			cnt = Math.max(cnt, map[n-1][i]);
		}
System.out.println(cnt);
	}

}
