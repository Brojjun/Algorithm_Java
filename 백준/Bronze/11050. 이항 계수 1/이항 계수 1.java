import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		long r = sc.nextLong();
		long nr = n - r;
		
		long nn = 1;
		long rr = 1;
		long nrnr = 1;
		
		for(long i = n; i >= 1; i--) nn *= i;
		for(long i = r; i >= 1; i--) rr *= i;
		for(long i = nr; i >= 1; i--) nrnr *= i;
		/*
		System.out.println(nn);
		System.out.println(rr);
		System.out.println(nrnr);
		*/
		System.out.println(nn / (rr * nrnr));
	}
}
