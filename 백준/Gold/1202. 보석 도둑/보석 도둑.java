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
import java.util.Scanner;
import java.util.StringTokenizer;

class July2 implements Comparable<July2>{
	int w;
	int v;
	public July2(int w, int v) {
		super();
		this.w = w;
		this.v = v;
	}
	
	@Override
	public int compareTo(July2 o) {
		return o.v - this.v;
	}
	
}

class July implements Comparable<July>{
	int w;
	int v;
	public July(int w, int v) {
		super();
		this.w = w;
		this.v = v;
	}
	
	@Override
	public int compareTo(July o) {
		if(this.w == o.w) return o.v - this.v;
		return this.w - o.w;
	}
	
}

public class Main {
	static int ncnt;
	static int bcnt;
	static PriorityQueue<Integer> bag = new PriorityQueue<>();
	static PriorityQueue<July2> use = new PriorityQueue<>();
	static PriorityQueue<July> sub = new PriorityQueue<>();
	static long	max_value = 0;
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		input();
//		System.out.println("가방 : ");
//		while(!bag.isEmpty())System.out.println(bag.poll());
//		System.out.println("보석 : ");
//		while(!sub.isEmpty())System.out.println(sub.poll().v);
		calValue();
		System.out.println(max_value);
	}

	private static void calValue() {
		while(!bag.isEmpty()) {
			int n = bag.poll();
			
			while(!sub.isEmpty() && sub.peek().w <= n) {
				int w2 = sub.peek().w;
				int v2 = sub.peek().v;
				sub.poll();
				use.add(new July2(w2,v2));
			}
			if(!use.isEmpty())
				max_value += use.poll().v;
		}
		
	}

	private static void input() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		ncnt = Integer.parseInt(st.nextToken());
		bcnt = Integer.parseInt(st.nextToken());

		
		for(int i = 0 ; i < ncnt; i++) {
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			int weight = Integer.parseInt(st2.nextToken());
			int value = Integer.parseInt(st2.nextToken());
			sub.add(new July(weight,value));
		}
		
		for(int i = 0 ; i < bcnt; i++) {
			int im =Integer.parseInt(br.readLine()); 
			bag.add(im);
		}
		
	}
}
