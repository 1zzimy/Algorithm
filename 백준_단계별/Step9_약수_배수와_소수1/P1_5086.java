package 백준_단계별.Step9_약수_배수와_소수1;

import java.io.*;
import java.util.*;

public class P1_5086 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		while(true) {
			st = new StringTokenizer(br.readLine());

			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());

			if(A == 0 && B == 0) break;

			if(A < B && B % A == 0) {
				sb.append("factor");
			} else if(A > B && A % B == 0) {
				sb.append("multiple");
			} else {
				sb.append("neither");
			}
			sb.append("\n");
		}
		br.close();

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
