package 백준_단계별.Step10_기하1_직사각형과_삼각형;

import java.io.*;

public class P4_15894 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		br.close();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(String.valueOf(4 * n));
		bw.flush();
		bw.close();
	}
}
