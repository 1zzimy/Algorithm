package 백준_단계별.Step8_수학1;

import java.io.*;
import java.util.*;

public class P1_2745 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		char[] N = st.nextToken().toCharArray();
		int B = Integer.parseInt(st.nextToken());

		br.close();

		int cnt = 0;
		for(int i = 0; i < N.length; i++) {
			if(N[i] >= '0' && N[i] <= '9') cnt += (int)(Math.pow(B, N.length-i-1) * (N[i] - '0'));
			else cnt += (int)(Math.pow(B, N.length-1-i) * (N[i] - 'A' + 10));
		}

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(String.valueOf(cnt));
		bw.flush();
		bw.close();
	}
}
