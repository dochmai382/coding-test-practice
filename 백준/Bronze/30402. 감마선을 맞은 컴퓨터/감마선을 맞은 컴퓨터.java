import java.io.*;
import java.util.*;

class Solution {
	public String inputAndSolve(BufferedReader br) throws IOException {
        for (int i = 0; i < 15; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 15; j++) {
                char pixel = st.nextToken().charAt(0);
                if (pixel == 'w') return "chunbae";
                else if (pixel == 'b') return "nabi";
            }
        }
        return "yeongcheol";
    }
}

class Main {
	public static void main(String[] args) throws IOException {
		try (
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		) {
			Solution sol = new Solution();
			bw.write(sol.inputAndSolve(br));
		}
	}
}
