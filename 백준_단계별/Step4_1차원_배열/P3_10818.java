package 백준_단계별.Step4_1차원_배열;

import java.io.*;
import java.util.*;

public class P3_10818 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());

		br.close();

		/**
		 * 첫 번째 방식 : 1차원 배열 X, Math 사용 (448 ms / 88056 KB)
		 * 시간 복잡도 : O(N), 공간 복잡도 : O(1)
		 */
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int num;

		for(int i = 0; i < N; i++) {
			num = Integer.parseInt(st.nextToken());
			max = Math.max(max, num);
			min = Math.min(min, num);
		}

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(min + " " + max);
		bw.flush();
		bw.close();

		/**
		 * 두 번째 방식 : 1차원 배열 + sort 사용 (1252 ms / 105544 KB)
		 * 시간 복잡도 : O(n log n), 공간 복잡도 : O(N)
		 */
		// int[] arr = new int[N];
		// for(int i = 0; i < N; i++) {
		// 	arr[i] = Integer.parseInt(st.nextToken());
		// }
		//
		// Arrays.sort(arr); // O(n log n)
		//
		// BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// bw.write(arr[0] + " " + arr[N - 1]);
	}
}
