import java.io.*;
import java.util.*;

class Solution {
    private int N, M;
    private String S;
    
    public void input(BufferedReader br) throws IOException {
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        S = br.readLine();
    }
    
    private int solve() {
        int count = 0;
        int result = 0;
        
        for (int i = 1; i < M-1; i++) {
            if (S.charAt(i-1) == 'I' && S.charAt(i) == 'O' && S.charAt(i+1) == 'I') {
                count++;
                
                if (count == N) {
                    result++;
                    count--;
                }
                i++;
            } else {
                count = 0;
            }
        }
        return result;
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