import java.io.*;
import java.util.*;

class Solution {
	private int result;

	public void input(BufferedReader br) throws IOException {
		int N = Integer.parseInt(br.readLine());
		String K = br.readLine();
		
		result = solve(K);
	}
	
	public int solve(String k) {
		int odd = 0;
		int even = 0;
		
        for (int i = 0; i < k.length(); i++) {
            int d = k.charAt(i);
            if (d % 2 == 0) even++;
            else odd++;
        }
		
		return (even > odd) ? 0 : (odd > even) ? 1 : -1;
	}

	public String getResult() {
		return String.valueOf(result);
	}

}

class Main {
	public static void main(String[] args) throws IOException {
		try (
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		) {
			Solution sol = new Solution();
			sol.input(br);
			bw.write(sol.getResult());
		}
	}
}

