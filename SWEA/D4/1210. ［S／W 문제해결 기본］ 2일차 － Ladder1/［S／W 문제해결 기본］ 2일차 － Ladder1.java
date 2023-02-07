import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] dir = {-1,1};
		
		for (int test = 1; test <= 10; test++) {
			//input
			br.readLine();
			int map[][] = new int[101][101];
			
			for(int y = 0; y < 100; y++) {
				String[] im = br.readLine().split(" ");
				for(int x = 0; x < 100; x++)
					map[y][x] = Integer.parseInt(im[x]);
			}
			
			//MOVE
			int endX = -1;
			outerloop:
			for(int x = 0; x < 100; x++) {
				int[][] vir = new int[100][100];
				int nx = x;
				int ny = 0;
				if(map[0][x] == 0) continue;
				while(ny<100) {
					//좌우 먼저 살피고, 그다음 중력
					
					for(int m = 0; m < 2; m++) {
						int nnx = nx + dir[m];
						if(nnx < 0 || nnx >= 100)continue;
						if(map[ny][nnx] == 0 || map[ny][nnx] == 0)continue;
						vir[ny][nnx] = 1;
						nx = nnx;
						
						while (true) {
							if (nnx + dir[m] == -1 || nnx + dir[m] == 100)
								break;
							if (map[ny][nnx + dir[m]] == 0)
								break;
							nnx += dir[m];
							vir[ny][nx] = 1;
							nx = nnx;
						}
						break;

					}
					
					vir[ny][nx] = 1;
					ny++;
					
					if(ny == 99) {
						if(map[ny][nx] == 2) {
							System.out.println("#"+test+" "+x);
							
							
							/*for(int i = 0; i<100;i++) {
								for(int j = 0; j<100;j++) {
									System.out.print(vir[i][j]+ " ");
								}
								System.out.println();
							}*/
							continue outerloop;
						}
						break;
					}
					
					
					
				}
			}
		}
	}
}
