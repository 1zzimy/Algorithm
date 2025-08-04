package 백준_단계별.Step2_조건문;

import java.io.*;

public class P4_14681 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());

        if(x > 0 && y > 0) bw.write('1');
        else if(x < 0 && y > 0) bw.write('2');
        else if(x < 0 && y < 0) bw.write('3');
        else bw.write('4');

        br.close();
        bw.flush();
        bw.close();
    }
}
