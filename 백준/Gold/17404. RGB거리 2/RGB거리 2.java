import java.util.*;
import java.io.*;

class Solution {
    int N;
    int[][] cost;
    
    final int INF = 1000 * 1000 + 1;
    
    public void input(BufferedReader br) throws IOException {
        N = Integer.parseInt(br.readLine());
        cost = new int[N][3];
        
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            cost[i][0] = Integer.parseInt(st.nextToken());
            cost[i][1] = Integer.parseInt(st.nextToken());
            cost[i][2] = Integer.parseInt(st.nextToken());
        }
    }

    private int solve() {
        int ans = INF;
        int[][] dp = new int[N][3];
        
        for (int start = 0; start < 3; start++) {
            for (int i = 0; i < 3; i++) {
                if (i == start) dp[0][i] = cost[0][i];
                else dp[0][i] = INF;
            }
            
            for (int i = 1; i < N; i++) {
                dp[i][0] = Math.min(dp[i-1][1], dp[i-1][2]) + cost[i][0];
                dp[i][1] = Math.min(dp[i-1][0], dp[i-1][2]) + cost[i][1];
                dp[i][2] = Math.min(dp[i-1][0], dp[i-1][1]) + cost[i][2];
            }
            
            for (int i = 0; i < 3; i++) {
                if (i != start) ans = Math.min(ans, dp[N-1][i]);
            }
        }
        
        return ans;
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