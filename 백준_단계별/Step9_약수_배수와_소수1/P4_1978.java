package 백준_단계별.Step9_약수_배수와_소수1;

import java.io.*;
import java.util.*;

public class P4_1978 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());
		int cnt = 0;
		for(int i = 0; i < N; i++) {
			int a = Integer.parseInt(st.nextToken());
			if(a == 1) continue;
			boolean is_prime = true;
			for(int j = 2; j < a; j++) {
				if(a % j == 0) {
					is_prime = false;
					break;
				}
			}
			if(is_prime) cnt++;
		}
		br.close();

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(String.valueOf(cnt));
		bw.flush();
		bw.close();
	}
}
