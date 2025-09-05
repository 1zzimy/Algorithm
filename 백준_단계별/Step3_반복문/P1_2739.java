package 백준_단계별.Step3_반복문;

import java.io.*;

public class P1_2739 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		for(int i = 1; i <= 9; i++) {
			bw.write(N + " * " + i + " = " + N * i + "\n");
		}

		br.close();
		bw.flush();
		bw.close();
	}
}
