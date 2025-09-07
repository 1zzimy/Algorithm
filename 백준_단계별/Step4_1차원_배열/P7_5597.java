package 백준_단계별.Step4_1차원_배열;

import java.io.*;
import java.util.*;

public class P7_5597 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		boolean[] arr = new boolean[30];
		int num;

		for(int i = 0; i < 28; i++) {
			num = Integer.parseInt(br.readLine());
			arr[num - 1] = true;
		}

		br.close();

		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 30; i++) {
			if(!arr[i]) sb.append(i + 1).append("\n");
		}

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
