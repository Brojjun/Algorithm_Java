import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

/*
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String[] yxbag = br.readLine().split(" ");

int by = Integer.parseInt(yxbag[0]);
int bx = Integer.parseInt(yxbag[1]);
int bag = Integer.parseInt(yxbag[2]);

 */

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		String map[] = br.readLine().split(" ");
		
		double data[] = new double[map.length];
		double max_data = 0;
		for(int i = 0; i < map.length; i++) {
				data[i] = Integer.parseInt(map[i]);
				max_data = Math.max(max_data, data[i]);
		}
		
		double sum = 0;
		for(int i = 0; i < map.length; i++) {
			data[i] = data[i] / max_data * 100;
			sum += data[i];
		}
		System.out.println(sum / n);
		
	}
}