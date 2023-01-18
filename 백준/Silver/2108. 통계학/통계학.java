import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int[] data = new int[t];
		int[] cntData = new int[8001];
		long addData = 0;
		
		for(int i = 0 ; i < t; i++) {
			data[i] = in.nextInt();
			addData += data[i];
			cntData[data[i] + 4000]++;
		}
		
		//first
		System.out.println((long)Math.round((double)addData / t));
		
		//second
		Arrays.sort(data);
		System.out.println(data[t/2]);
		
		//third
		//num[0] == cnt ,num[1] == at, num[2] 중복횟수검사
		int[] num = new int[3];
		
		for(int i = 0; i <= 8000; i++) {
			if(num[0] == cntData[i] && num[2] == 0) {
				num[0] = cntData[i];
				num[1] = i;
				num[2]++;
			}
			else if(num[0] < cntData[i]) {
				num[0] = cntData[i];
				num[1] = i;
				num[2] = 0;
			}
		}
		System.out.println(num[1] - 4000);
		
		//fourth
		System.out.println(data[t-1] - data[0]);
}
}