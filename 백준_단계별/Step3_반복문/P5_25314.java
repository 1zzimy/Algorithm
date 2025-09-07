package 백준_단계별.Step3_반복문;

import java.io.*;

public class P5_25314 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		for(int i=0; i< N/4; i++) {
			bw.write("long ");
		}

		bw.write("int" + "\n");

		br.close();
		bw.flush();
		bw.close();
	}
}
