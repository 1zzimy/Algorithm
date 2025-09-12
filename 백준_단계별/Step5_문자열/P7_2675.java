package 백준_단계별.Step5_문자열;

import java.io.*;
import java.util.*;

public class P7_2675 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());

		int i;
		String s;

		StringBuilder sb = new StringBuilder();
		while(T > 0) {
			st = new StringTokenizer(br.readLine());
			i = Integer.parseInt(st.nextToken());
			s = st.nextToken();

			for(char c : s.toCharArray()) {
				sb.append(String.valueOf(c).repeat(i));
			}
			sb.append("\n");
			T--;
		}
		br.close();

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
