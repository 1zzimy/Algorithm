package 백준_단계별.Step8_수학1;

import java.io.*;
import java.util.*;

public class P7_2869 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		br.close();

		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());

		int day = (int)Math.ceil((double)(V - A) / (A - B)) + 1;
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(String.valueOf(day));
		bw.flush();
		bw.close();
	}
}
