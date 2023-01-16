import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		//EOF문제 -> hasNext를 통해 End Of File을 체크
		while(in.hasNext()) {
			int b = in.nextInt();
			int c = in.nextInt();
			System.out.println(b + c);
		}
	}

}
