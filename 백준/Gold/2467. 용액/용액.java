import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;


class Point{
	int y;
	int x;
	public Point(int y, int x) {
		super();
		this.y = y;
		this.x = x;
	}
	
}

public class Main {
	
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int bn = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int map[] = new int[bn];
		for(int i = 0 ; i < bn; i++)map[i] = Integer.parseInt(st.nextToken());
	
		int front = 0;
		int end = bn - 1;
		long max = Long.MAX_VALUE;
		long memo[] = new long[2];
		
		for(int i = 0; i < bn; i++) {
			if(front >= end)break;

			long now = map[end] + map[front];
			if(max > Math.abs(now)) {memo[0] = map[front]; memo[1] = map[end]; max = Math.abs(now);}
			if(now == 0) {memo[0] = map[front]; memo[1] = map[end]; break;}
			else if(now < 0)front++;
			else if(now > 0)end--;
			
		}
		System.out.println(memo[0] + " "  + memo[1]);
	
	}

	
}
