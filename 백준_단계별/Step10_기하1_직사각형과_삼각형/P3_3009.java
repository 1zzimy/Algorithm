package 백준_단계별.Step10_기하1_직사각형과_삼각형;

import java.io.*;
import java.util.*;

public class P3_3009 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		HashSet<Integer> hashSet_x = new HashSet<>();
		HashSet<Integer> hashSet_y = new HashSet<>();

		int x, y;
		for(int i = 0; i < 3; i++) {
			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());

			if(hashSet_x.contains(x)) hashSet_x.remove(x);
			else hashSet_x.add(x);

			if(hashSet_y.contains(y)) hashSet_y.remove(y);
			else hashSet_y.add(y);
		}

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(hashSet_x.iterator().next() + " " + hashSet_y.iterator().next());
		bw.flush();
		bw.close();
	}
}
