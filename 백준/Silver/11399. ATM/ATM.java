import java.io.*;
import java.util.*;

class Solution {
    private int[] P;
    
    public void input(BufferedReader br) throws IOException {
        int N = Integer.parseInt(br.readLine());
        P = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            P[i] = Integer.parseInt(st.nextToken());
        }
    }
    
    public int solve() {
        Arrays.sort(P);
        
        int waitTime = 0;
        int totalTime = 0;
        
        for (int time : P) {
            waitTime += time;
            totalTime += waitTime;
        }
        
        return totalTime;
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
            bw.write(String.valueOf(sol.solve()));
        }
    }
}