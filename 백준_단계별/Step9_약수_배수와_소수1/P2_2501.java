package 백준_단계별.Step9_약수_배수와_소수1;

import java.io.*;
import java.util.*;

public class P2_2501 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		br.close();

		int cnt = 0;
		int i = 1;
		while(i <= N) {
			if (N % i == 0)
				cnt++;
			if (cnt == K)
				break;
			i++;
		}
		if(i > N) i = 0;

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(String.valueOf(i));
		bw.flush();
		bw.close();
	}
}
