package 백준_단계별.Step5_문자열;

import java.io.*;

public class P4_11654 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int c = br.read(); // char -> 아스키 코드값
		br.close();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(String.valueOf(c));
		bw.flush();
		bw.close();
	}
}
