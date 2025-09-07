package 백준_단계별.Step4_1차원_배열;

import java.io.*;
import java.util.*;

public class P8_3052 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 내가 푼 방식 : List 활용 (104 ms / 14140 KB)
		// List<Integer> list = new ArrayList<>();
		// int n;

		// for(int i = 0; i < 10; i++) {
		// 	n = Integer.parseInt(br.readLine()) % 42;
		// 	if(list.isEmpty() || !list.contains(n)) list.add(n);
		// }

		// HashSet 활용 (104 ms / 14252 KB)
		Set<Integer> set = new HashSet<>();

		for(int i = 0; i < 10; i++) {
			set.add(Integer.parseInt(br.readLine()) % 42);
		}

		br.close();

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// bw.write(String.valueOf(list.size()));
		bw.write(String.valueOf(set.size()));
		bw.flush();
		bw.close();
	}
}
