package 백준_단계별.Step7_2차원_배열;

import java.io.*;
import java.util.*;

public class P3_10798 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		String[] arr = new String[5];
		int max = Integer.MIN_VALUE;

		for(int i = 0; i < 5; i++) {
			arr[i] = br.readLine();
			if(arr[i].length() > max) max = arr[i].length();
		}
		br.close();

		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < max; i++) {
			for(int j = 0; j < 5; j++) {
				if(arr[j].length() > i) {
					sb.append(arr[j].charAt(i));
				}
			}
		}

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
