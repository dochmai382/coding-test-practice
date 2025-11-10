import java.io.*;
import java.util.*;

class Solution {
	private int n, d; 
	private int[] solved;
	private int total;
	private StringBuilder sb = new StringBuilder();
	
	
	public void input(BufferedReader br) throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		d = Integer.parseInt(st.nextToken());
		
		solved = new int[n];
		for (int i = 0; i < n; i++) {
			solved[i] = Integer.parseInt(br.readLine());
			total += solved[i];
		}
	}
	
	private void solve() {
		int reward = d / total;
		for (int i = 0; i < n; i++) {
			sb.append(solved[i] * reward).append("\n");
		}
	}	
	
	public String getResult() {
		solve();
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
			sol.input(br);
			bw.write(sol.getResult());
		}
	}
}