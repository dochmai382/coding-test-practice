import java.io.*;
import java.util.*;

class Solution {
    private int N;
    private int[][] house;
    
    public void input(BufferedReader br) throws IOException {
        N = Integer.parseInt(br.readLine());
        house = new int[N][N];
        
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                house[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }
    
    private long solve() {
        // dp[r][c][direction]: 0=가로, 1=세로, 2=대각선
        long[][][] dp = new long[N][N][3]; 
        
        dp[0][1][0] = 1;
        
        for (int r = 0; r < N; r++) {
            for (int c = 2; c < N; c++) {
                if (house[r][c] == 1) continue;
                
                dp[r][c][0] = dp[r][c-1][0] + dp[r][c-1][2]; 
                
                if (r >= 1) {
                    dp[r][c][1] = dp[r-1][c][1] + dp[r-1][c][2];
                    
                    if (house[r-1][c] == 0 && house[r][c-1] == 0) {
                        dp[r][c][2] = dp[r-1][c-1][0] + dp[r-1][c-1][1] + dp[r-1][c-1][2];
                    }
                }
            }
        }
                
        return dp[N-1][N-1][0] + dp[N-1][N-1][1] + dp[N-1][N-1][2];
    }
    
    public String getResult() {
        return String.valueOf(solve());
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