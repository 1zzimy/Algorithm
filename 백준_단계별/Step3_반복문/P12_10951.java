package 백준_단계별.Step3_반복문;

/**
 * EOF (End of Fild)
 * - 파일 종료 조건 없이 입력만 주어진 경우에 사용
 * - 입력에서 더이상 읽을 수 있는 데이터가 존재하지 않을 때 반복문 종료
 *
 * 1. Scanner
 * - 더이상 읽을 데이터가 없으면 NoSuchElementException을 던짐
 * - 방법 1. try-catch 문으로 예외 발생 시 반복문 종료 처리
 * - 방법 2. scanner 메서드 hasNext(), hasNextInt()를 통해 처리
 * - 주의 ) IDE, 터미널에서 입력할 경우 공백과 엔터를 쳤을 때 이 또한 입력 이벤트로 데이터가 스트림에 넣어지기 때문에 예외 발생 X
 *
 * 2. BufferedReader
 * - 더이상 읽을 데이터가 없으면 null 을 반환
 */

import java.io.*;
import java.util.*;

public class P12_10951 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		String str;

		while ((str = br.readLine()) != null) {
			st = new StringTokenizer(str);
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			sb.append(A + B).append("\n");
		}

		br.close();

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
