package 백준_단계별.Step2_조건문;

import java.io.*;
import java.util.*;

public class P5_2884 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int H = Integer.parseInt(st.nextToken()); // 0 <= H <= 23
		int M = Integer.parseInt(st.nextToken()); // 0 <= M <= 59

		if(M >= 45) M -= 45;
		else {
			if(H == 0) H = 23;
			else H -= 1;

			M += 15;
		}

		bw.write(H + " " + M + "\n");

		br.close();
		bw.flush();
		bw.close();
	}
}
