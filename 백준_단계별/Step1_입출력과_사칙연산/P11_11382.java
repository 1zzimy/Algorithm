package 백준_단계별.Step1_입출력과_사칙연산;

import java.io.*;
import java.util.StringTokenizer;

public class P11_11382 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 런타임 에러 (NumberFormat) 발생 -> 10^12 이면 int형 아님? -> Long
        // int 최댓값 = 2,147,483,647 -> 약 2*10^9 까지 허용

        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        long C = Long.parseLong(st.nextToken());

        bw.write(String.valueOf( A + B + C));

        br.close();
        bw.flush();
        bw.close();
    }
}


