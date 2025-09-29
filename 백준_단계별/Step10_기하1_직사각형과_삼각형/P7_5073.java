package 백준_단계별.Step10_기하1_직사각형과_삼각형;

import java.io.*;
import java.util.*;

public class P7_5073 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int[] arr = new int[3];
		StringBuilder sb = new StringBuilder();
		while(true) {
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < 3; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			if(arr[0] == 0 && arr[1] == 0 && arr[2] == 0) break;
			Arrays.sort(arr);

			if(arr[2] >= arr[0] + arr[1]) sb.append("Invalid").append("\n");
			else if(arr[0] == arr[1] && arr[1] == arr[2]) sb.append("Equilateral").append("\n");
			else if(arr[0] == arr[1] || arr[1] == arr[2]) sb.append("Isosceles").append("\n");
			else sb.append("Scalene").append("\n");
		}
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
