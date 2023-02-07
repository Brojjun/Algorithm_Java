import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

import javax.management.monitor.StringMonitorMBean;

public class Main {
	public static void main(String[] args) throws Exception{
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		
		
		StringBuffer sb = new StringBuffer();
		
		int bn = sc.nextInt();
		
		List<Integer> map = new ArrayList<>();
		Stack<Integer> arr = new Stack<>();
		
		for(int i = 0; i < bn; i++) map.add(sc.nextInt());
		
		int cnt = 1;

		while(!map.isEmpty()) {
			//System.out.println(cnt);
			//System.out.println("map : " + map.get(0));
			//System.out.println("arr : " + arr.peek());
			
			if(arr.empty()) {
				//System.out.println("+");
				sb.append("+\n");
				//System.out.println("EMPTY");
				arr.push(cnt++);
			}
			
			else if(map.get(0).intValue() == arr.peek().intValue()) {
				sb.append("-\n");
				//System.out.println("-");
				map.remove(0);
				arr.pop();
			}
			
			else if(map.get(0).intValue() >= cnt) {
				sb.append("+\n");
				//System.out.println("+");
				arr.push(cnt++);
	
			}
			
			else if(map.get(0).intValue() < cnt) {
				
				sb.delete(0, sb.length());
				//System.out.println(map.get(0) + " : " + arr.peek());
				sb.append("NO");
				break;
			}
		}
		
		System.out.println(sb.toString());
	}
}


