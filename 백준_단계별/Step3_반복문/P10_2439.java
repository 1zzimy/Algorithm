package 백준_단계별.Step3_반복문;

import java.io.*;

public class P10_2439 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();

		for(int i = 1; i <= N; i++) {
			sb.append(" ".repeat(N - i));
			sb.append("*".repeat(i)).append("\n");
		}

		br.close();

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
