package 백준_단계별.Step1_입출력과_사칙연산;

import java.io.*;

public class P10_2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());

        int C = B;
        for(int i = 0; i < 3; i++) {
            bw.write(String.valueOf(A * (C % 10)) + '\n');
            C /= 10;
        }
        bw.write(String.valueOf(A * B));
        br.close();
        bw.flush();
        bw.close();

    }
}
