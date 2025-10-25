package 프로그래머스_고득점.Type1_해시;

import java.util.HashMap;
import java.util.Map;

public class Lv1_42576 {
	public static void main(String[] args) {
		Solution s = new Solution();
		// 테스트 케이스
		String[] participant = { "mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		String result = s.solution(participant, completion);
		System.out.println(result);
	}
}

class Solution {
	public String solution(String[] participant, String[] completion) {
		HashMap<String, Integer> hashMap = new HashMap<>();
		for(String str : participant) hashMap.put(str, hashMap.getOrDefault(str, 0) + 1);
		for(String str : completion) hashMap.put(str, hashMap.get(str) - 1);

		// 모든 key, value 쌍을 반복하는 경우, keySet보다 entrySet이 더 효율적 !
		for(Map.Entry<String, Integer> key : hashMap.entrySet()) {
			if(key.getValue() != 0) {
				return key.getKey();
			}
		}
		return "";
	}
}