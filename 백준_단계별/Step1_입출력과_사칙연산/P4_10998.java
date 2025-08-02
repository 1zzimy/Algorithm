package 백준_단계별.Step1_입출력과_사칙연산;

import java.io.*;
import java.util.StringTokenizer;

public class P4_10998 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        // int -> String 변환 : String.valueOf 사용
        bw.write(String.valueOf(A * B));

        br.close();
        bw.flush();
        bw.close();
    }
}
