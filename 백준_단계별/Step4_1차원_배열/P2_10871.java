package 백준_단계별.Step4_1차원_배열;

import java.io.*;
import java.util.*;

public class P2_10871 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());

		br.close();

		StringBuilder sb = new StringBuilder();
		int num;
		for (int i = 0; i < N; i++) {
			num = Integer.parseInt(st.nextToken());
			if(num < X) sb.append(num).append(" ");
		}

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
