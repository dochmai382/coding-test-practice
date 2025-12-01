import java.io.*;
import java.util.*;

class Solution {
    public long inputAndSolve(BufferedReader br) throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
		long A = Long.parseLong(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		long C = Long.parseLong(br.readLine());
		
		if (A + B >= (2 * C)) return (A + B) - (2 * C);
		else return A + B;
    }
}

class Main {
	public static void main(String[] args) throws IOException {
		try (
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		) {
			Solution sol = new Solution();
			bw.write(String.valueOf(sol.inputAndSolve(br)));
		}
	}
}