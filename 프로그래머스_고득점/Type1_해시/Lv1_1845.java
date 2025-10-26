package 프로그래머스_고득점.Type1_해시;

import java.util.HashMap;
import java.util.HashSet;

public class Lv1_1845 {
	public static void main(String[] args) {
		Solution s = new Solution();
		// 테스트 케이스
		int[] nums = {3,1,2,3};
		int result = s.solution(nums);
		System.out.println(result);
	}
}
class Solution {
	public int solution(int[] nums) {
		// 문제 방법 1 - HashSet 활용
		HashSet<Integer> hashSet = new HashSet<>();
		for(int i : nums) hashSet.add(i);
		return Math.min(hashSet.size(), nums.length / 2);

		// 문제 방법 2 - HashMap 활용
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		for(int i : nums) hashMap.put(i, hashMap.getOrDefault(i, 0) + 1);
		return Math.min(hashMap.size(), nums.length / 2);
	}
}