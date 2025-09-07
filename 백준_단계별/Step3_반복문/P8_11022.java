package 백준_단계별.Step3_반복문;

import java.io.*;
import java.util.*;

public class P8_11022 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();

		for(int i = 1; i <= T; i++) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());

			sb.append("Case #").append(i).append(": ");
			sb.append(A).append(" + ").append(B).append(" = ");
			sb.append(A + B).append("\n");
		}

		br.close();

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
