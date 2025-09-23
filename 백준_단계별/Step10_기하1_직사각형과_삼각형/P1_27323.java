package 백준_단계별.Step10_기하1_직사각형과_삼각형;

import java.io.*;

public class P1_27323 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(String.valueOf(A * B));
		bw.flush();
		bw.close();
	}
}
