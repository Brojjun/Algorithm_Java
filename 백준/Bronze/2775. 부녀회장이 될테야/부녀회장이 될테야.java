import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] building = new int[15][15];
		
		for(int i = 0; i < 15; i++) building[0][i] = i;
		
		int cnt = 1;
		while(cnt < 15) {
			int i = 1;
			building[cnt][i] = building[cnt-1][i];
			for(i = 2;i < 15; i++) {
				building[cnt][i] = building[cnt][i-1] + building[cnt-1][i];
			}
			cnt++;
		}
		
		int tc = sc.nextInt();
		for(int i = 0; i < tc; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(building[a][b]);
		}
		
	}
}
