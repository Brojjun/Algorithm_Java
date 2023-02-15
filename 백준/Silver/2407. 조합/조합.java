import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;



public class Main {
	static boolean visited[];
	static int map[];
	static int N;
	static int M;
	static long cnt;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer NM = new StringTokenizer(br.readLine());
		N = Integer.parseInt(NM.nextToken());
		M = Integer.parseInt(NM.nextToken());
		map = new int[M];
		visited = new boolean[N];
		

		BigInteger n = BigInteger.ONE;
		BigInteger m = BigInteger.ONE;
		BigInteger r = BigInteger.ONE;


		long R = N-M;
	
		for(int i = 2; i <= N; i++) {n = n.multiply(new BigInteger(String.valueOf(i)));}
		for(int i = 2; i <= M; i++) {m = m.multiply(new BigInteger(String.valueOf(i)));}
		for(int i = 2; i <= R; i++) {r = r.multiply(new BigInteger(String.valueOf(i)));}
		


		n = n.divide(r);
		n = n.divide(m);
		System.out.println(n);
		
	


	}

}
