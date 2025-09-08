package 백준_단계별.Step5_문자열;

import java.io.*;

public class P1_27866 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String S = br.readLine();

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(S.charAt(Integer.parseInt(br.readLine()) - 1));
		br.close();
		bw.flush();
		bw.close();
	}
}
