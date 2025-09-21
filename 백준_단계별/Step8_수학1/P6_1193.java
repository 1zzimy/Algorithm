package 백준_단계별.Step8_수학1;

import java.io.*;

public class P6_1193 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());
		br.close();

		int K = 1;
		int range = 0;

		while(X > range + K) {
			range += K;
			K++;
		}

		int pos = X - range;
		int numerator, denominator;

		if(K % 2 == 0) {
			numerator = pos;
			denominator = K - pos + 1;
		} else {
			numerator = K - pos + 1;
			denominator = pos;
		}

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(numerator + "/" + denominator);
		bw.flush();
		bw.close();
	}
}
