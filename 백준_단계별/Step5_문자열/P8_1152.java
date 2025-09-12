package 백준_단계별.Step5_문자열;

import java.io.*;
import java.util.*;

public class P8_1152 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		br.close();

		// int cnt = 0;
		// while(st.hasMoreTokens()) {
		// 	st.nextToken();
		// 	cnt++;
		// }

		int cnt = st.countTokens();

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(String.valueOf(cnt));
		bw.flush();
		bw.close();
	}
}
