package 백준_단계별.Step6_심화1;

import java.io.*;

public class P4_10988 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] arr = br.readLine().toCharArray();
		br.close();

		int a = 1;
		for(int i = 0; i < arr.length/2; i++) {
			if(arr[i] != arr[arr.length - i - 1]) {
				a = 0; break;
			}
		}

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(String.valueOf(a));
		bw.flush();
		bw.close();
	}
}
