package 백준_단계별.Step11_시간_복잡도;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P7_24313 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] fn = new int[2];
		for (int i = 0; i < 2; i++) {
			fn[i] = Integer.parseInt(st.nextToken());
		}
		int c = Integer.parseInt(br.readLine());
		int n0 = Integer.parseInt(br.readLine());
		br.close();

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		if (fn[0] <= c && fn[0] * n0 + fn[1] <= c * n0)
			bw.write(String.valueOf(1));
		else
			bw.write(String.valueOf(0));
		bw.flush();
		bw.close();
	}
}
