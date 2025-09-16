package 백준_단계별.Step7_2차원_배열;

import java.io.*;
import java.util.*;

public class P2_2566 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int x = 0;
		int y = 0;
		int max = Integer.MIN_VALUE;
		int a;

		for(int i = 1; i <= 9; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 1; j <= 9; j++) {
				a = Integer.parseInt(st.nextToken());
				if(a > max) {
					max = a;
					x = i;
					y = j;
				}
			}
		}
		br.close();

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(max + "\n" + x + " " + y);
		bw.flush();
		bw.close();
 	}
}
