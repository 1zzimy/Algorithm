package 백준_단계별.Step2_조건문;

import java.io.*;
import java.util.*;
import java.lang.*;

public class P7_2480 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		// 주사위 눈
		int A = Integer.parseInt(st.nextToken()); // 1 <= A <= 6
		int B = Integer.parseInt(st.nextToken()); // 1 <= B <= 6
		int C = Integer.parseInt(st.nextToken()); // 1 <= C <= 6

		// 상금
		int prizeMoney;

		// 내가 푼 방식 : 단순한 if-else 문 구현 (116 ms / 15880 KB)
		if (A != B && B != C && C != A) prizeMoney = Math.max(Math.max(A, B),C) * 100;
		else if((A == B && B != C) || (A == C && A != B)) prizeMoney = 1000 + A*100;
		else if(B == C && B != A) prizeMoney = 1000 + B*100;
		else prizeMoney = 10000 + A*1000;

		// 다른 사람 풀이 방식 : 배열 정렬 사용 (120 ms / 15872 KB)
		// int[] arr = {A, B, C};
		// Arrays.sort(arr);
		//
		// if(arr[0] == arr[2]) prizeMoney = 10000 + arr[0] * 1000;
		// else if(arr[0] == arr[1] || arr[1] == arr[2]) prizeMoney = 1000 + arr[1] * 100;
		// else prizeMoney = arr[2] * 100;

		bw.write(prizeMoney + "\n");

		br.close();
		bw.flush();
		bw.close();
	}
}
