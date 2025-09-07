package 백준_단계별.Step4_1차원_배열;

import java.io.*;

public class P4_2562 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int max = Integer.MIN_VALUE;
		int idx = 0;
		int[] arr = new int[9];

		for(int i = 0; i < 9; i++) {
			arr[i] = Integer.parseInt(br.readLine());

			if(max < arr[i]) {
				max = arr[i];
				idx = i;
			}
		}

		br.close();

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(max + "\n" + (idx + 1));
		bw.flush();
		bw.close();
	}
}
