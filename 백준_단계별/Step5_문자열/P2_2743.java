package 백준_단계별.Step5_문자열;

import java.io.*;

public class P2_2743 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		br.close();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(String.valueOf(str.length()));
		bw.flush();
		bw.close();
	}
}
