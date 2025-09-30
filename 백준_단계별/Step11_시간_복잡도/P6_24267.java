package 백준_단계별.Step11_시간_복잡도;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P6_24267 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		br.close();

		long cnt = 0;
		for (int i = 1; i < n; i++) {
			cnt += i * (n - i - 1);
		}
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(cnt + "\n" + 3);
		bw.flush();
		bw.close();
	}
}
