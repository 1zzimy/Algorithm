package 백준_단계별.Step2_조건문;

import java.io.*;

public class P2_9498 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int score = Integer.parseInt(br.readLine());


        // 내가 푼 방식: if-else 문 (100 ms / 14208 KB)
        if(score >= 90) bw.write('A');
        else if(score >= 80) bw.write('B');
        else if(score >= 70) bw.write('C');
        else if(score >= 60) bw.write('D');
        else bw.write('F');

        // switch 문으로도 풀 수 있지 않을까? (124 ms / 14292 KB)
        score /= 10;

        switch (score) {
            case 10:
            case 9:
                bw.write('A');
                break;
            case 8:
                bw.write('B');
                break;
            case 7:
                bw.write('C');
                break;
            case 6:
                bw.write('D');
                break;
            default:
                bw.write('F');
        }

        /* 지피티한테 물어본 결과, 표준 입출력 환경의 측정 오차 때문
        switch 문과 if-else 문 사이의 성능 차이는 무시해도 될 수준 */

        br.close();
        bw.flush();
        bw.close();
    }
}
