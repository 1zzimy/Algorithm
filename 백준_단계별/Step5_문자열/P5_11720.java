package 백준_단계별.Step5_문자열;

import java.io.*;

public class P5_11720 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String str = br.readLine();
		br.close();

		int cnt = 0;
		for(int i = 0; i < N; i++) {
			cnt += Character.getNumericValue(str.charAt(i)); // char -> int 형 변환
			// cnt += str.charAt(i) - '0';
			// cnt += Integer.parseInt(String.valueOf(str.charAt(i)));
		}

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(String.valueOf(cnt));
		bw.flush();
		bw.close();
	}
}
