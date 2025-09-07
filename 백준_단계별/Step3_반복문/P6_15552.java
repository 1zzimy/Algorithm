package 백준_단계별.Step3_반복문;

import java.io.*;
import java.util.*;

public class P6_15552 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st; // split() 보다 StringTokenizer 가 약간 더 빠름

		int N = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder(); // 결과를 StringBuilder 에 저장

		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());

			sb.append(A + B).append("\n");
		}

		br.close();

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(sb.toString()); // 루프가 끝난 후 한 번만 출력
		bw.flush();
		bw.close();
	}
}
