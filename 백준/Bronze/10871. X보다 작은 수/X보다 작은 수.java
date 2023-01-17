import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int data = sc.nextInt();
		int[] map = new int[n];
		int cnt = 0;
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			if(a < data) 
				map[cnt++] = a;
		}
		for(int i = 0; i < cnt; i++)
			System.out.print(map[i]+" ");
		
	}
}
