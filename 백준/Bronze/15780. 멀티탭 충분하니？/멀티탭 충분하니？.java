import java.util.*;
import java.io.*;

class Solution {
    private int N, K;
    private int[] A;
    
    public void input(BufferedReader br) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        
        A = new int[K];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < K; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
    }
    
    private int countMax() {
        int count = 0;
        for (int i = 0; i < K; i++) {
            count += (A[i] + 1) / 2; // (a + b - 1) / b
        }
        return count;
    }
    
    public String getResult() {
        int result = countMax();
        if (result >= N) {
            return "YES";
        } else {
            return "NO";
        }
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