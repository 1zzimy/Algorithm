package 백준_단계별.Step9_약수_배수와_소수1;

import java.io.*;
import java.util.*;

public class P3_9506 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true) {
			int n = Integer.parseInt(br.readLine());
			if(n == -1) break;
			int cnt = 0;
			Deque<Integer> deque = new ArrayDeque<>();
			for(int i = 1; i < n; i++) {
				if(n % i == 0) {
					cnt += i;
					deque.add(i);
				}
			}

			if(n != cnt) {
				sb.append(n).append(" is NOT perfect.").append("\n");
			} else {
				sb.append(n).append(" = ");
				while(!deque.isEmpty()) {
					sb.append(deque.pollFirst());
					if(!deque.isEmpty()) sb.append(" + ");
				}
				sb.append("\n");
			}
		}
		br.close();

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
