package 백준_단계별.Step2_조건문;

import java.io.*;
import java.util.StringTokenizer;

public class P1_1330 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        if(A > B) bw.write('>');
        else if(A < B) bw.write('<');
        else bw.write("==");

        br.close();
        bw.flush();
        bw.close();
    }
}
