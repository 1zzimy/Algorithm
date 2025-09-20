package 백준_단계별.Step8_수학1;

import java.io.*;

public class P5_2292 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		br.close();

		int cnt = 1;
		int range = 1;

		while(N > range) {
			range += 6 * cnt;
			cnt++;
		}

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(String.valueOf(cnt));
		bw.flush();
		bw.close();
	}
}
