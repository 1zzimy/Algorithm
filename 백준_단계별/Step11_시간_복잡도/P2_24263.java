package 백준_단계별.Step11_시간_복잡도;

import java.io.*;

public class P2_24263 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n  = Integer.parseInt(br.readLine());
		br.close();

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(n + "\n" + 1);
		bw.flush();
		bw.close();
	}
}
