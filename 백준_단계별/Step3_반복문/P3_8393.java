package 백준_단계별.Step3_반복문;

import java.io.*;
import java.util.*;

public class P3_8393 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int count = 0;

		for(int i = 1; i <= n; i++) {
			count += i;
		}

		bw.write(count + "\n");

		br.close();
		bw.flush();
		bw.close();
	}
}
