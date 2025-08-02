package 백준_단계별.Step1_입출력과_사칙연산;

import java.io.*;

public class P7_10926 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String id = br.readLine();
        bw.write(id + "??!");

        br.close();
        bw.flush();
        bw.close();
    }
}
