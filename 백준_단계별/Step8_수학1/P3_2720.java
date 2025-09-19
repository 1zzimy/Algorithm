package 백준_단계별.Step8_수학1;

import java.io.*;

public class P3_2720 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int[] arr = {25, 10, 5, 1};

		int C;
		StringBuilder sb = new StringBuilder();
		for(int t = 0; t < T; t++) {
			C = Integer.parseInt(br.readLine());
			for(int i = 0; i < 4; i++) {
				sb.append(C / arr[i]).append(" ");
				C %= arr[i];
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
