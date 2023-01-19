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
		int max_data = 0;
		int max_at = 0;
		for(int i = 0; i < 9; i++) {
			int now_data = Integer.parseInt(br.readLine());
			if (max_data < now_data) {
				max_data = now_data;
				max_at = i;
			}
		}
		System.out.println(max_data);
		System.out.println(max_at + 1);
	}
}