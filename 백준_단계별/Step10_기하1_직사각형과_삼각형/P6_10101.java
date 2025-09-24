package 백준_단계별.Step10_기하1_직사각형과_삼각형;

import java.io.*;

public class P6_10101 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		br.close();
		String str;
		if(a + b + c == 180) {
			if(a == b && b == c) str = "Equilateral";
			else if(a == b || b == c || c == a) str = "Isosceles";
			else str = "Scalene";
		} else {
			str = "Error";
		}
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(str);
		bw.flush();
		bw.close();
	}
}
