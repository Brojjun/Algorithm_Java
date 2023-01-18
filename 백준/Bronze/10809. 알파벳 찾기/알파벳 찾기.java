import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int map[] = new int[26];
		for(int i = 0; i < 26; i++)map[i] = -1;
		
		for(int i = 0; i < s.length(); i++) {
			if(map[s.charAt(i) - 'a'] != -1)continue;
			map[s.charAt(i) - 'a'] = i;
		}
		
		for(int i = 0; i < 26; i++) System.out.print(map[i]+" ");
}
}
