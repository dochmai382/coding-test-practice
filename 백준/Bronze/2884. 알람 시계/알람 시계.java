import java.io.*;
import java.util.*;

class Solution {
    private int H, M;
    
    public void input(BufferedReader br) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        H = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
    }
    
    public String solve() {
        int time = H * 60 + M;
        time -= 45;
        
        if (time < 0) time += 24 * 60;
        
        H = time / 60;
        M = time % 60;
        
        return H + " " + M;
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
			bw.write(sol.solve());
		}
	}
}