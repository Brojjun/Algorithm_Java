import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> arr = new Stack<>();
		int n = Integer.parseInt(br.readLine());
		for(int t = 0; t < n; t++) {
		
		int a = Integer.parseInt(br.readLine());
		
		if( a == 0)
			arr.pop();
		else {
			arr.push(a);
		}
		
		
		
		}
		int returNum=0;
		while(!arr.empty())returNum+=arr.pop();
		System.out.println(returNum);

	}
}
