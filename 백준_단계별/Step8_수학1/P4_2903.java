package 백준_단계별.Step8_수학1;

import java.io.*;

public class P4_2903 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		br.close();

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(String.valueOf((int)Math.pow(Math.pow(2, N) + 1, 2)));
		bw.flush();
		bw.close();
	}
}
