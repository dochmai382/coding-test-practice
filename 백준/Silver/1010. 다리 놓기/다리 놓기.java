import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            int T = Integer.parseInt(br.readLine());
            for (int i = 0; i < T; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int N = Integer.parseInt(st.nextToken());
                int M = Integer.parseInt(st.nextToken());

                System.out.println(solve(M, N));
            }
        }
    }

    private static long solve(int n, int r) {
        if (r < 0 || r > n) return 0;
        if (r > n/2) r = n - r;

        long[][] dp = new long[n+1][r+1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= Math.min(i, r); j++) {
                if (j == 0 || j == i) dp[i][j] = 1;
                else dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
            }
        }

        return dp[n][r];
    }
}