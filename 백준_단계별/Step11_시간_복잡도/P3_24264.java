package 백준_단계별.Step11_시간_복잡도;

import java.io.*;

public class P3_24264 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n  = Long.parseLong(br.readLine());
		br.close();

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write((long)Math.pow(n, 2) + "\n" + 2);
		bw.flush();
		bw.close();
	}
}
