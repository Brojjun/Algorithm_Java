import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	

	public static class People implements Comparable<People>{
		static int num;
		int age;
		int number;
		String name;
		
		public People(int age, String name) {
			super();
			this.age = age;
			this.name = name;
			number = num++;
		}

		@Override
		public int compareTo(People o) {
			// TODO Auto-generated method stub
			if(this.age == o.age)
				return this.number - o.number;
			return this.age - o.age;
		}
		
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test_case = Integer.parseInt(br.readLine());
		People[] pp = new People[test_case];
		
		for(int i = 0; i < test_case; i++) {
			String[] imm = br.readLine().split(" ");
			pp[i] = new People(Integer.parseInt(imm[0]), imm[1]);
		}
		Arrays.sort(pp);
		
		for(int i = 0; i < test_case; i++) {
			System.out.println(pp[i].age + " " + pp[i].name);
		}
	}
}
