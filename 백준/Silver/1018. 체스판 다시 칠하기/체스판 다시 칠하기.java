import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.management.monitor.StringMonitorMBean;

class Paper implements Comparable<Paper>{
	int first;
	int second;
	
	public Paper(int first, int second) {
		super();
		this.first = first;
		this.second = second;
	}

	@Override
	public int compareTo(Paper o) {
		// TODO Auto-generated method stub
		if(this.first == o.first)
			return this.second - o.second;
		else
			return this.first - o.first;
	}
}

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int by = Integer.parseInt(st.nextToken());
		int bx = Integer.parseInt(st.nextToken());
		String[][] map = new String[by][bx];
		for(int i = 0; i < by; i++) {
			map[i] = br.readLine().split("");
		}
		int cnt = Integer.MAX_VALUE;
		
		
		outerloop:
		for(int y = 0; y < by; y++) {
			for(int x = 0; x < bx; x++) {
				if(y+8 > by)break outerloop;
				if(x+8 > bx)break;
				int bcn = 0;
				int wcn = 0;
				
				for(int ny = y; ny < y+8; ny++) {
					for(int nx = x; nx < x+8; nx++) {
						//if(map[ny][nx].equals("W"))System.out.println("ㅎㅎ");
						if((ny+nx) % 2 == 0 && map[ny][nx].equals("W")) bcn++;
						if((ny+nx) % 2 == 1 && map[ny][nx].equals("B")) bcn++;
						
						if((ny+nx) % 2 == 0 && map[ny][nx].equals("B")) wcn++;
						if((ny+nx) % 2 == 1 && map[ny][nx].equals("W")) wcn++;
					}
				}
				cnt = Math.min(Math.min(wcn, bcn),cnt);
				
			}
		}
		
		System.out.println(cnt);
			
			
		
		
		
	}
}


