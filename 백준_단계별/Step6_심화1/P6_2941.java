package 백준_단계별.Step6_심화1;

import java.io.*;

public class P6_2941 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 내가 푼 방식
		char[] arr = br.readLine().toCharArray();
		br.close();
		int cnt = 0;
		for(int i = 0; i < arr.length; i++) {
			cnt++;
			if(i + 1 < arr.length && arr[i] == 'c' && (arr[i+1] == '=' || arr[i+1] == '-')) {
				i++;
			} else if(i + 1 < arr.length && arr[i] == 'd' && arr[i+1] == '-') {
				i++;
			} else if(i + 2 < arr.length && arr[i] == 'd' && arr[i+1] == 'z' && arr[i+2] == '=') {
				i += 2;
			} else if(i + 1 < arr.length && (arr[i] == 'l' || arr[i] == 'n') && arr[i+1] == 'j') {
				i++;
			} else if(i + 1 < arr.length && (arr[i] == 's' || arr[i] == 'z') && arr[i+1] == '=') {
				i++;
			}
		}

		// 다른 사람 풀이
		String str = br.readLine();
		String[] al = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		for(String s : al) {
			str = str.replace(s, "*");
		}
		cnt = str.length();

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(String.valueOf(cnt));
		bw.flush();
		bw.close();
	}
}
