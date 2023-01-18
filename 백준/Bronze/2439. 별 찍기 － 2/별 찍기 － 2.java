import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 1; i <= t; i++) {
			int j = 1;
			for(; j <= t-i; j++) {
				System.out.print(" ");
			}
			for(; j <= t; j++) {
				System.out.print("*");
			}
			System.out.println();
	}

}
}