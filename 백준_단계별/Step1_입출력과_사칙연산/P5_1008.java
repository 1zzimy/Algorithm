package 백준_단계별.Step1_입출력과_사칙연산;

import java.io.*;
import java.util.StringTokenizer;

public class P5_1008 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        //  int / int -> int 값으로 출력. 따라서 형 변환 필수 !
        bw.write(String.valueOf((double) A / B));

        br.close();
        bw.flush();
        bw.close();
    }
}
