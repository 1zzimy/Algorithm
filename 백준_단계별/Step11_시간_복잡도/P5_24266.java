package 백준_단계별.Step11_시간_복잡도;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P5_24266 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		br.close();

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write((n * n * n) + "\n" + 3);
		bw.flush();
		bw.close();
	}
}
