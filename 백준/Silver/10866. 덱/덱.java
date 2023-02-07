import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.management.monitor.StringMonitorMBean;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Deque<Integer> arr = new ArrayDeque<>();
		
		int bn = Integer.parseInt(br.readLine());
		
		
		
		for(int i = 0; i < bn; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String im = st.nextToken();
			
			if(im.equals("push_back")) 
				arr.addLast(Integer.parseInt(st.nextToken()));
			
			if(im.equals("push_front")) 
				arr.addFirst(Integer.parseInt(st.nextToken()));
			
			if(im.equals("pop_front")) {
				if(arr.isEmpty())System.out.println(-1);
				else System.out.println(arr.pollFirst());
			}
			
			if(im.equals("pop_back")) {
				if(arr.isEmpty())System.out.println(-1);
				else System.out.println(arr.pollLast());
			}
			
			if(im.equals("size")) {
				System.out.println(arr.size());
			}
			
			if(im.equals("empty")) {
				System.out.println(arr.isEmpty()?1:0);
			}
			
			if(im.equals("front")) {
				if(arr.isEmpty())System.out.println(-1);
				else System.out.println(arr.getFirst());
			}
			
			if(im.equals("back")) {
				if(arr.isEmpty())System.out.println(-1);
				else System.out.println(arr.getLast());
			}
			
		}
	}
}


