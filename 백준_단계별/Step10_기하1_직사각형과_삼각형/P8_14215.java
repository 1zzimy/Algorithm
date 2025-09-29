package 백준_단계별.Step10_기하1_직사각형과_삼각형;

import java.io.*;
import java.util.*;

public class P8_14215 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int[] arr = new int[3];
		for(int i = 0; i < 3; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		arr[2] = Math.min(arr[0] + arr[1] - 1, arr[2]);

		int sum = 0;
		for(int i = 0; i < 3; i++) {
			sum += arr[i];
		}
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(String.valueOf(sum));
		bw.flush();
		bw.close();
	}
}
