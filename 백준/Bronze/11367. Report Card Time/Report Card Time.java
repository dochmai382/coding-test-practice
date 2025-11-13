import java.io.*;
import java.util.*;

class Solution {
	private StringBuilder sb = new StringBuilder();

	public void inputAndSolve(BufferedReader br) throws IOException {
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			int grade = Integer.parseInt(st.nextToken());
			sb.append(name).append(" ").append(getLetterGrade(grade)).append("\n");
		}
	}

	private String getLetterGrade(int grade) {
		if (grade >= 97) return "A+";
		else if (grade >= 90) return "A";
		else if (grade >= 87) return "B+";
		else if (grade >= 80) return "B";
		else if (grade >= 77) return "C+";
		else if (grade >= 70) return "C";
		else if (grade >= 67) return "D+";
		else if (grade >= 60) return "D";
		else return "F";
	}
	
	public String getResult() {
		return sb.toString().trim();
	}
}

class Main {
	public static void main(String[] args) throws IOException {
		try (
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		) {
			Solution sol = new Solution();
			sol.inputAndSolve(br);
			bw.write(sol.getResult());
		}
	}
}