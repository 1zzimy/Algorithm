package 백준_단계별.Step3_반복문;

import java.io.*;
import java.util.*;

public class P4_25304 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int X = Integer.parseInt(br.readLine()); // 영수증에 적힌 총 금액
		int N = Integer.parseInt(br.readLine()); // 구매한 물건의 종류 수
		int a, b; // 각 물건의 가격과 개수
		int sum = 0; // 총 계산한 금액

		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			sum += a * b;
		}

		bw.write(X == sum ? "Yes" : "No");

		br.close();
		bw.flush();
		bw.close();
	}
}
