package 백준_단계별.Step2_조건문;

import java.io.*;
import java.util.*;

public class P6_2525 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		// 현재 시각
		int A = Integer.parseInt(st.nextToken()); // 시 (0 <= A <= 23)
		int B = Integer.parseInt(st.nextToken()); // 분 (0 <= B <= 59)

		// 요리하는 데 필요한 시간
		int C = Integer.parseInt(br.readLine()); // 분 단위(0 <= C <= 1,000)

		// 끝나는 시각 계산
		A += (B + C) / 60;
		B = (B + C) % 60;

		A %= 24;

		bw.write(A + " " + B + "\n");

		br.close();
		bw.flush();
		bw.close();
	}
}





