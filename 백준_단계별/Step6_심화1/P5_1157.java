package 백준_단계별.Step6_심화1;

import java.io.*;
import java.util.*;

public class P5_1157 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] arr = br.readLine().toUpperCase().toCharArray();
		br.close();

		HashMap<Character, Integer> hashMap = new HashMap<>();

		for (char c : arr) {
			hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
		}

		int max = Collections.max(hashMap.values());
		List<Character> list = new ArrayList<>();
		for(Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
			if(entry.getValue() == max) list.add(entry.getKey());
		}

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(String.valueOf(list.size() > 1 ? "?" : list.get(0)));
		bw.flush();
		bw.close();

		// HashMap : 해시 연산, 박싱/언박싱, Collections.max() 같은 오버헤드가 있어서 상대적으로 느림
		// -> 배열(int[26])로 변경하면 속도가 줄어듦
		// TODO : 배열로 풀었을 때 시간이 얼마나 줄어드는지 확인 !

	}
}
