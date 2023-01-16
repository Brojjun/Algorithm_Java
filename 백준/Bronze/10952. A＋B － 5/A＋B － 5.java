import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		
		while(true) {
			int b = in.nextInt();
			int c = in.nextInt();
			if(b == 0 && c == 0)break;
			System.out.println(b + c);
		}
	}

}
