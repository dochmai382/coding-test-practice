import java.io.*;
import java.util.*;

class Solution {
    private int N;
    private long[][] points;
    
    public void input(BufferedReader br) throws IOException {
        N = Integer.parseInt(br.readLine());
        points = new long[N][2];
        
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            points[i][0] = Long.parseLong(st.nextToken());
            points[i][1] = Long.parseLong(st.nextToken());
        }
    }
    
    public double solve() {
        long sum1 = 0, sum2 = 0;
        
        for (int i = 0; i < N; i++) {
            int next = (i + 1) % N;
            sum1 += points[i][0] * points[next][1];
            sum2 += points[i][1] * points[next][0];
        }
        
        return Math.abs(sum1 - sum2) / 2.0;
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
            bw.write(String.format("%.1f", sol.solve()));
        }
    }
}