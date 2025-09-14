package 백준_단계별.Step6_심화1;

import java.io.*;
import java.util.*;

public class P2_3003 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		br.close();

		int[] arr = {1, 1, 2, 2, 2, 8};

		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 6; i++) {
			sb.append(arr[i] - Integer.parseInt(st.nextToken())).append(" ");
		}

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
