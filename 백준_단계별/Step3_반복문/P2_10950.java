package 백준_단계별.Step3_반복문;

import java.io.*;
import java.util.*;

public class P2_10950 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());
		int A, B;

		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			bw.write((A + B) + "\n");
		}

		br.close();
		bw.flush();
		bw.close();
	}
}
