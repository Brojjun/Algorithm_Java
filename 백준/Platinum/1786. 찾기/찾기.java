import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Main {
	static int pi[];
	static char context[];
	static char find[];
	static List<Integer>attt = new ArrayList<>();
	
	static int findlen;
	static int textlen;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer bf = new StringBuffer();
		//본문 먼저 입력 후, 탐색글 입력
		context = br.readLine().toCharArray();
		find = br.readLine().toCharArray();
		findlen = find.length;
		textlen = context.length;
		
		pi = new int[findlen];

		findPi();
		findAt();
		bf.append(attt.size() + "\n");
		for(int a : attt)bf.append(a+" ");
		System.out.println(bf.toString());
	}

	private static void findAt() {
		int at = 0;
		for(int core = 0; core < textlen; core++) {
			while(at > 0 && context[core] != find[at]) {
				at = pi[at-1];
			}
			if(context[core] == find[at]) {
				if(at == findlen - 1) {
					attt.add(core - at + 1);
					at = pi[at];
				} else {
					at++;
				}
			}
			
		}
		
	}

	private static void findPi() {
		int j = 0;
		for(int i = 1; i < findlen; i++) {
			while(j > 0 && find[j] != find[i]) {
				j = pi[j-1];
			}
			if(find[j] == find[i]) {
				pi[i] = ++j;
			}
		}
		
	}

}
