package 백준_단계별.Step5_문자열;

import java.io.*;

public class P10_5622 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		br.close();

		int cnt = 0;
		for(char c : str.toCharArray()) {
			// 해당 케이스의 경우 Java 11 에서 지원하지 않음 -> 컴파일 에러 발생
			// switch (c) {
			// 	case 'A', 'B', 'C': cnt += 3; break;
			// 	case 'D', 'E', 'F': cnt += 4; break;
			// 	case 'G', 'H', 'I': cnt += 5; break;
			// 	case 'J', 'K', 'L': cnt += 6; break;
			// 	case 'M', 'N', 'O': cnt += 7; break;
			// 	case 'P', 'Q', 'R', 'S': cnt += 8; break;
			// 	case 'T', 'U', 'V': cnt += 9; break;
			// 	case 'W', 'X', 'Y', 'Z': cnt += 10; break;
			// }

			if(c <= 'C') cnt += 3;
			else if(c <= 'F') cnt += 4;
			else if(c <= 'I') cnt += 5;
			else if(c <= 'L') cnt += 6;
			else if(c <= 'O') cnt += 7;
			else if(c <= 'S') cnt += 8;
			else if(c <= 'V') cnt += 9;
			else cnt += 10;
		}

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(String.valueOf(cnt));
		bw.flush();
		bw.close();
	}
}
