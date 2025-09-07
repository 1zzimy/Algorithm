package 백준_단계별.Step4_1차원_배열;

import java.io.*;
import java.util.*;

public class P9_10811 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[] arr = new int[N];

		for(int i = 0; i < N; i++) {
			arr[i] = i + 1;
		}

		int i, j, tmp;

		for(int l= 0; l < M; l++) {
			st = new StringTokenizer(br.readLine());
			i = Integer.parseInt(st.nextToken());
			j = Integer.parseInt(st.nextToken());

			for(int k = 0; k <= (j - i) / 2; k++) {
				tmp = arr[i + k - 1];
				arr[i + k - 1] = arr[j - k - 1];
				arr[j - k - 1] = tmp;
			}
		}

		br.close();

		StringBuilder sb = new StringBuilder();
		for(int t : arr) {
			sb.append(t).append(" ");
		}

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
