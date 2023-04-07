import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static class Tree {
		int size;
		int leaf;
		long data[];

		public void print() {
			int cnt = 1;
			int space = 1;
			System.out.println();
			for (int i = 1; i < data.length; i++, cnt++) {
				System.out.print(data[i] + " ");
				if (cnt == space) {
					cnt = 0;
					space *= 2;
					System.out.println();
				}
			}
			System.out.println();
		}

		public Tree(long input[]) {
			// size , leaf 구하기
			int len = input.length;
			leaf = 1;
			while (leaf < len)
				leaf *= 2;
			size = leaf * 2;
			// data에 넣기
			data = new long[size];
			for (int i = 0; i < size; i++)
				data[i] = 1;

			for (int i = 0; i < len; i++)
				data[i + leaf] = input[i] % 1000000007;

			// 줄기 만들기
			for (int i = data.length - 1; i > 0; i--) {
				data[i / 2] *= data[i];
				data[i / 2] %= 1000000007;
			}

		}

		public void update(int at, long value) {
			at += leaf - 1;
			long per = data[at];
			data[at] = value;
			while(at > 1) {
				at /= 2;
				data[at] = (data[at*2] * data[at*2 + 1])% 1000000007;
			}
			//print();
		
		}

		public long select(int begin, int end) {
			long result = 1;
			begin += leaf;	
			end += leaf;
			begin--;
			end--;

			while (begin <= end) {

				if (begin % 2 == 1) {
					result = (result * data[begin++]) % 1000000007;
				}
				if (end % 2 == 0) {
					result = (result * data[end--]) % 1000000007;
				}
				begin /= 2;
				end /= 2;
			}

			if (begin == end)
				result = (result * data[begin]) % 1000000007;

			if (result == 1)
				return 0;
			return result;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		long data[] = new long[n];

		for (int i = 0; i < n; i++)
			data[i] = Long.parseLong(br.readLine());

		Tree tree = new Tree(data);

		for (int i = 0; i < m + k; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			// update
			if (a == 1) {
				int b = Integer.parseInt(st.nextToken());
				long c = Long.parseLong(st.nextToken());
				tree.update(b, c);
			}
			// select
			else {
				int b = Integer.parseInt(st.nextToken());
				int c = Integer.parseInt(st.nextToken());
				System.out.println(tree.select(b, c));
			}
		}

	}
}