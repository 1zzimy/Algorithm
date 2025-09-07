package 프로그래머스_고득점.Type1_완전탐색;

public class Lv1_86491 {
	public static void main(String[] args) {
		Solution s = new Solution();
		// 테스트 케이스
		// int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
		// int[][] sizes = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
		int[][] sizes = {{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}};
		int result = s.solution(sizes);
		System.out.println(result);
	}
}

// 내가 푼 풀이
class Solution {
	public int solution(int[][] sizes) {
		int r = 0, c = 0;
		for (int[] size : sizes) {
			int w = size[0];
			int h = size[1];

			if (w > h) {
				int tmp = w;
				w = h;
				h = tmp;
			}

			r = Math.max(r, w);
			c = Math.max(c, h);

		}
		return r * c;
	}
}

// 다른 사람이 푼 간결한 코드
// class Solution {
// 	public int solution(int[][] sizes) {
// 		int r = 0, c = 0;
// 		for (int[] card : sizes) {
// 			r = Math.max(r, Math.max(card[0], card[1]));
// 			c = Math.max(c, Math.min(card[0], card[1]));
// 		}
// 		return r * c;
// 	}
// }