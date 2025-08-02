package 백준_단계별.Step1_입출력과_사칙연산;

import java.io.*;

public class P8_18108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        /*
          Buddhist Era(B.E.) : 불기 연도
          Christian Era(C.E.) : 서기 연도
          -> 서기 연도 + 543 = 불기 연도
         */

        int BE = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(BE - 543));

        br.close();
        bw.flush();
        bw.close();
    }
}
