package 백준_단계별.Step7_2차원_배열;

import java.io.*;
import java.util.*;

public class P4_2563 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		boolean[][] arr = new boolean[100][100];
		int N = Integer.parseInt(br.readLine());
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int r = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			for(int j = 0; j < 10; j++) {
				for(int k = 0; k < 10; k++) {
					arr[r+j][c+k] = true;
				}
			}
		}
		br.close();
		int cnt = 0;

		for(int i = 0; i < 100; i++) {
			for(int j = 0; j < 100; j++) {
				if(arr[i][j]) cnt++;
			}
		}

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(String.valueOf(cnt));
		bw.flush();
		bw.close();
	}
}
