import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static int map[];
	static int virtual[];
	static int bn;

	public static void input() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		bn = Integer.parseInt(br.readLine());
		map = new int[bn];
		virtual = new int[bn];

		for (int i = 0; i < bn; i++)
			map[i] = Integer.parseInt(br.readLine());

	}

	public static void sort(int begin, int end) {
		if (begin == end)
			return;

		int mid = (begin + end) / 2;
		sort(begin, mid);
		sort(mid + 1, end);
		merge(begin, end);

	}

	/*
	 * 출력이슈 -> for문을 통해 한줄 씩 출력하는 것이 문제
	 * 방안 1. StringBuilder를 통해 저장 후 한번에 출력 -> ok
	 * 방안 2. BufferedWriter를 사용해보면 어떨까?
	 * */
	public static void print() throws IOException {
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		char[] rs = new char[(bn+1) * 2];
		for (int i = 0; i < bn; i++) {
			bw.write(String.valueOf(map[i]));
			bw.newLine();
		}
	
		bw.flush();
		
		//방안 1 
//		StringBuilder sb = new StringBuilder();
//		for (int i = 0; i < bn; i++)
//			sb.append(map[i] + "\n");
//		
//			System.out.print(sb);
	}
	public static void merge(int begin, int end) {
		int mid = (begin + end) / 2;

		int left = begin; // 왼쪽 시작
		int right = mid + 1; // 오른 쪽 시작
		int cnt = begin; // 현재위치

		// 한쪽이 끝에 도달하면 정지
		while (left <= mid && right <= end) {
			if (map[left] <= map[right])
				virtual[cnt++] = map[left++];
			else
				virtual[cnt++] = map[right++];
		}

		// 나머지 채워주기
		if (left > mid) {
				while(right <= end)
					virtual[cnt++] = map[right++];
		} 
		
		else {
			while(left <= mid)
				virtual[cnt++] = map[left++];
		}
		
		
		//변화를 map에 반영해주기
		for(int i = begin; i <= end; i++) map[i] = virtual[i];
	}

	public static void main(String[] args) throws Exception {
		input();
		sort(0, bn - 1); // 인자값은 map배열의 시작 위치와 끝 위치
		print();


	}
}
