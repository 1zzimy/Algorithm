package 백준_단계별.Step6_심화1;

import java.io.*;

public class P1_25083 {
	public static void main(String[] args) throws IOException {
		StringBuilder sb = new StringBuilder();
		sb.append("         ,r'\"7").append("\n");
		sb.append("r`-_   ,'  ,/").append("\n");
		sb.append(" \\. \". L_r'").append("\n");
		sb.append("   `~\\/").append("\n");
		sb.append("      |").append("\n");
		sb.append("      |").append("\n");

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}