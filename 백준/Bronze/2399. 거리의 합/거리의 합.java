import java.io.*;
import java.util.*;

class Solution {
    private int N;
    private int[] x;
    
    public void input(BufferedReader br) throws IOException {
        N = Integer.parseInt(br.readLine());
        x = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            x[i] = Integer.parseInt(st.nextToken());
        }
    }
    
    private long solve() {
        Arrays.sort(x);
        
        long[] P = new long[N];
        P[0] = x[0];
        for (int i = 1; i < N; i++) {
            P[i] = P[i - 1] + x[i];
        }
        
        long result = 0L;
        for (int i = 0; i < N; i++) {
            long count = i;
            long sumBefore = (i == 0) ? 0 : P[i - 1];
            long currentSum = (count * x[i]) - sumBefore;
            result += currentSum;
        }
        
        return result * 2;
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