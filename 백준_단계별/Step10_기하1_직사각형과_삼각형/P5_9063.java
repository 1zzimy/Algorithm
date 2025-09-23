package 백준_단계별.Step10_기하1_직사각형과_삼각형;

import java.io.*;
import java.util.*;

public class P5_9063 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());

		int min_x = Integer.MAX_VALUE;
		int min_y = Integer.MAX_VALUE;
		int max_x = Integer.MIN_VALUE;
		int max_y = Integer.MIN_VALUE;

		int x, y;
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());

			if(min_x > x) min_x = x;
			if(max_x < x) max_x = x;
			if(min_y > y) min_y = y;
			if(max_y < y) max_y = y;
		}
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(String.valueOf((max_x - min_x) * (max_y - min_y)));
		bw.flush();
		bw.close();
	}
}
