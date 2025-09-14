package 백준_단계별.Step6_심화1;

import java.io.*;
import java.util.*;

public class P3_2444 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		br.close();

		// 내가 푼 방식 : for 문 사용 + Stringbuilder에 바로 넣기
		// StringBuilder sb = new StringBuilder();
		// for(int i = 1; i < N; i++) {
		// 	sb.append(" ".repeat(N - i)).append("*".repeat(2*i-1)).append("\n");
		// }
		// sb.append("*".repeat(2*N-1)).append("\n");
		// for(int i = N - 1; i > 0; i--) {
		// 	sb.append(" ".repeat(N - i)).append("*".repeat(2*i-1)).append("\n");
		// }

		// 다른 사람 풀이 : deque 사용하여 앞뒤로 동일한 내용 넣기, deque를 앞에서부터 빼내면서 StringBuilder에 넣기
		Deque<String> deque = new ArrayDeque<>();
		deque.add("*".repeat(2 * N - 1));
		for(int i = 1; i < N; i++) {
			String line = " ".repeat(i) + "*".repeat(2*(N-i) - 1);
			deque.offerFirst(line);
			deque.offerLast(line);
		}

		StringBuilder sb = new StringBuilder();
		while(!deque.isEmpty()) {
			sb.append(deque.pollFirst()).append("\n");
		}

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
