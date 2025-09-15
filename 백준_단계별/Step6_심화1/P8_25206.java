package 백준_단계별.Step6_심화1;

import java.io.*;
import java.util.*;

public class P8_25206 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String str;
		double sum = 0;
		double totalCredit = 0;
		HashMap<String, Double> map = new HashMap<>();
		map.put("A+", 4.5);
		map.put("A0", 4.0);
		map.put("B+", 3.5);
		map.put("B0", 3.0);
		map.put("C+", 2.5);
		map.put("C0", 2.0);
		map.put("D+", 1.5);
		map.put("D0", 1.0);
		map.put("F", 0.0);

		while((str = br.readLine()) != null) {
			st = new StringTokenizer(str);
			st.nextToken();
			double credit = Double.parseDouble(st.nextToken());
			String grade = st.nextToken();
			if(grade.equals("P")) continue;
			totalCredit += credit;
			sum += (credit * map.get(grade));
		}
		br.close();

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(String.valueOf(sum / totalCredit));
		bw.flush();
		bw.close();
	}
}
