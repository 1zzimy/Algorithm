package 백준_단계별.Step2_조건문;

import java.io.*;

public class P3_2753 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // leap year : 윤년
        int year = Integer.parseInt(br.readLine());

        // 내가 푼 방식: if-else 문 (96 ms / 14256 KB)
        if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) bw.write('1');
        else bw.write('0');

        // 삼항연산자 (104 ms / 14416 KB)
        bw.write(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0) ? '1' : '0');

        br.close();
        bw.flush();
        bw.close();
    }
}
