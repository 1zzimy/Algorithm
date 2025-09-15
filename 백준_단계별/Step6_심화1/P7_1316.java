package 백준_단계별.Step6_심화1;

import java.io.*;
import java.util.*;

public class P7_1316 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		for(int i = 0; i < N; i++) {
			char[] arr = br.readLine().toCharArray();
			List<Character> list = new ArrayList<>();
			boolean group = true;
			for(int j = 0; j < arr.length; j++) {
				if(list.contains(arr[j]) && (arr[j-1] != arr[j])) {
					group = false;
					break;
				}
				else list.add(arr[j]);
			}
			if(group) cnt++;
		}
		br.close();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(String.valueOf(cnt));
		bw.flush();
		bw.close();
	}
}
