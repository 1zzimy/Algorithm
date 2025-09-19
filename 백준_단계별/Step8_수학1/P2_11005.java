package 백준_단계별.Step8_수학1;

import java.io.*;
import java.util.*;

public class P2_11005 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());

		br.close();

		StringBuilder sb = new StringBuilder();
		while(N > 0) {
			sb.append(N % B < 10 ? (char)(N % B+'0') : (char)(N % B-10+'A'));
			N /= B;
		}

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(sb.reverse().toString());
		bw.flush();
		bw.close();
	}
}
