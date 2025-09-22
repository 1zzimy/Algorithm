package 백준_단계별.Step9_약수_배수와_소수1;

import java.io.*;

public class P5_2581 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		br.close();

		int cnt = 0;
		int min = 0;
		for(int i = N; i >= M; i--) {
			if(i == 1) continue;
			boolean is_prime = true;
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					is_prime = false;
					break;
				}
			}
			if(is_prime) {
				cnt += i;
				min = i;
			}
		}
		StringBuilder sb = new StringBuilder();
		if(cnt == 0) sb.append("-1");
		else sb.append(cnt).append("\n").append(min);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
