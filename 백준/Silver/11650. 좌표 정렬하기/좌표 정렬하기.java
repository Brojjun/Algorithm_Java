import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Point{
	int y;
	int x;
	
	public Point(int x, int y) {
		super();
		this.y = y;
		this.x = x;
	}
}
class PointCom implements Comparator<Point>{
	@Override
	public int compare(Point o1, Point o2) {
		// TODO Auto-generated method stub
		if (o1.x == o2.x)
			return o1.y - o2.y;
		return o1.x - o2.x;
	}
}

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//input
		List<Point> arr = new ArrayList<>();
		int n = Integer.parseInt(br.readLine());
		for(int i = 0; i < n; i++) {
			String[] imm = br.readLine().split(" ");
			arr.add(new Point(Integer.parseInt(imm[0]), Integer.parseInt(imm[1])));
		}
		//ArrayList sort
		Collections.sort(arr,new PointCom());
		
		//output
		for(int i = 0; i < n; i++) {
			System.out.println(arr.get(i).x +" "+arr.get(i).y );
		}
	}
}
