package 백준_단계별.Step4_1차원_배열;

import java.io.*;
import java.util.*;

public class P6_10813 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[] arr = new int[N];

		for(int i = 0; i < N; i++) {
			arr[i] = i + 1;
		}

		int tmp;

		while(M > 0) {
			st = new StringTokenizer(br.readLine());

			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());

			tmp = arr[i - 1];
			arr[i - 1] = arr[j - 1];
			arr[j - 1] = tmp;

			M--;
		}

		br.close();

		StringBuilder sb = new StringBuilder();

		for(int i : arr) {
			sb.append(i).append(" ");
		}

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
