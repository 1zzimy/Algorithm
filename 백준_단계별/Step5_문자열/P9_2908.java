package 백준_단계별.Step5_문자열;

import java.io.*;
import java.util.*;

public class P9_2908 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		br.close();

		StringBuilder sb = new StringBuilder();
		sb.append(st.nextToken()).reverse();
		int A = Integer.parseInt(sb.toString());
		sb.delete(0, sb.length());
		sb.append(st.nextToken()).reverse();
		int B = Integer.parseInt(sb.toString());

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(String.valueOf(Math.max(A, B)));
		bw.flush();
		bw.close();
	}
}
