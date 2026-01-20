import java.util.*;
import java.io.*;

class Solution {
    StringBuilder sb = new StringBuilder();
    
    public void input(BufferedReader br) throws IOException {
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[][] score = new int[2][n];
            
            for (int i = 0; i < 2; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < n; j++) {
                    score[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            
            sb.append(solve(n, score)).append("\n");
        }
    }

    private int solve(int n, int[][] arr) {
        if (n == 1) return Math.max(arr[0][0], arr[1][0]);
        
        int[][] dp = new int[2][n];
        dp[0][0] = arr[0][0];
        dp[1][0] = arr[1][0];
        dp[0][1] = arr[0][1] + arr[1][0];
        dp[1][1] = arr[1][1] + arr[0][0];
        
        for (int i = 2; i < n; i++) {
            dp[0][i] = arr[0][i] + Math.max(dp[1][i-1], dp[1][i-2]);
            dp[1][i] = arr[1][i] + Math.max(dp[0][i-1], dp[0][i-2]);
        }
        
        return Math.max(dp[0][n-1], dp[1][n-1]);
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
            sol.input(br);
            bw.write(sol.getResult());
        }
    }
}