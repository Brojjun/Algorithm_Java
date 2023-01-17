import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String score = "";
		if(a >= 90) score = "A";
		else if( a >= 80 && a <= 89) score = "B";
		else if( a >= 70 && a <= 79) score = "C";
		else if( a >= 60 && a <= 69) score = "D";
		else score = "F";
		System.out.println(score);
	}
}
