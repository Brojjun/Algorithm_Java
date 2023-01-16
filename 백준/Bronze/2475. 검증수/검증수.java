import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = 0;
		for(int i = 0; i < 5; i++) {
			number += Math.pow(in.nextInt(),2);
		}
		System.out.println(number % 10);
	}

}
