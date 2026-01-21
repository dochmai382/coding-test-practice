import java.util.*;
import java.io.*;

class Main {
    static long[][] dp = new long[31][31];
    
    public static void main(String[] args) throws IOException {
        makePascal();
        
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            int T = Integer.parseInt(br.readLine());
            for (int i = 0; i < T; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int N = Integer.parseInt(st.nextToken());
                int M = Integer.parseInt(st.nextToken());

                System.out.println(dp[M][N]);
            }
        }
    }

    private static void makePascal() {
        for (int i = 0; i <= 30; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) dp[i][j] = 1;
                else dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
            }
        }
    }
}