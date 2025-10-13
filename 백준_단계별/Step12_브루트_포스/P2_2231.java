package 백준_단계별.Step12_브루트_포스;

import java.io.*;

public class P2_2231 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		br.close();

		// 내가 푼 방식 (229392KB / 392ms)
		// StringBuilder sb = new StringBuilder();
		// for(int i = 1; i < N; i++) {
		// 	int sum = i;
		// 	char[] c = String.valueOf(i).toCharArray();
		// 	for (char value : c) {
		// 		sum += Integer.parseInt(String.valueOf(value));
		// 	}
		// 	if(sum == N) {
		// 		sb.append(i);
		// 		break;
		// 	}
		// }
		// if(sb.isEmpty()) sb.append(0);

		// 다른 풀이 방식 (14224KB / 100ms)
		int start = Math.max(1, N - 9 * String.valueOf(N).length());
		int result = 0;

		for(int i = start; i < N; i++) {
			int current = i;
			int sum = current;
			while(current > 0) {
				sum += current % 10;
				current /= 10;
			}
			if(sum == N) {
				result = i;
				break;
			}
		}

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// bw.write(sb.toString());
		bw.write(String.valueOf(result));
		bw.flush();
		bw.close();
	}
}
