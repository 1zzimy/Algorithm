package 백준_단계별.Step10_기하1_직사각형과_삼각형;

import java.io.*;
import java.util.*;

public class P2_1085 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());

		if(x > w - x) x = w - x;
		if(y > h - y) y = h - y;

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(String.valueOf(Math.min(x, y)));
		bw.flush();
		bw.close();
	}
}
