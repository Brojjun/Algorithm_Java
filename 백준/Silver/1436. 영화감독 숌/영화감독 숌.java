import java.util.Scanner;

public class Main {

	static int[] arr = new int[10011];
	static int cnt = 1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 666;
		arr[0] = 666;
		while(cnt < 10002) {
			String a = Integer.toString(i);
			if(a.contains("666")) {
				arr[cnt++] = i;
			}
		i++;
		}
		System.out.println(arr[n]);
	}
}


