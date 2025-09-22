package 백준_단계별.Step9_약수_배수와_소수1;

import java.io.*;

public class P6_11653 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		br.close();

		if(N != 1) {
			int K = 2;

			StringBuilder sb = new StringBuilder();
			while(N > K) {
				if(N % K == 0) {
					sb.append(K).append("\n");
					N /= K;
				}
				else K++;
			}
			sb.append(N);

			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			bw.write(sb.toString());
			bw.flush();
			bw.close();
		}
	}
}
