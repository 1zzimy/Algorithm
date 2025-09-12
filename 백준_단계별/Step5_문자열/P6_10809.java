package 백준_단계별.Step5_문자열;

import java.io.*;
import java.util.*;

public class P6_10809 {
	public static void main(String[] args) throws IOException {

		int[] arr = new int[26];
		for(int i = 0; i < 26; i++) {
			arr[i] = -1;
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		br.close();

		for(int i = 0; i < S.length(); i++) {
			int a = S.charAt(i) - 'a';
			if(arr[a] == -1) arr[a] = i;
		}

		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 26; i++) {
			sb.append(arr[i]).append(" ");
		}

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
