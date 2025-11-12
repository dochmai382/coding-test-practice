import java.io.*;
import java.util.*;

class Solution {
    private StringBuilder sb = new StringBuilder();
    
    public void inputAndSolve(BufferedReader br) throws IOException {
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append(lcm(a, b)).append(" ").append(gcd(a, b)).append("\n");
        }
    }
    
    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    private int lcm(int a, int b) {
        return a * b / gcd(a, b);
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