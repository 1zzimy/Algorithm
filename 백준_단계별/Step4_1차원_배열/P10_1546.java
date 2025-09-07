package 백준_단계별.Step4_1차원_배열;

import java.io.*;
import java.util.*;

public class P10_1546 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int max = Integer.MIN_VALUE;

		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if(max < arr[i]) max = arr[i];
		}

		double sum = 0;

		for(int i : arr) {
			sum += (double) i / max * 100;
		}

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(String.valueOf(sum / N));
		bw.flush();
		bw.close();
	}
}
