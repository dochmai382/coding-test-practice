import java.util.*;
import java.io.*;

class Solution {
    private int N;
    private int[] col;
    private int count;
    
    public void input(BufferedReader br) throws IOException {
        N = Integer.parseInt(br.readLine());
    }
    
    private void dfs(int row) {
        if (row == N) {
            count++;
            return;
        }
        
        for (int i = 0; i < N; i++) {
            col[row] = i;
            
            if (isOk(row)) dfs(row + 1);
        }
    }
    
    private boolean isOk(int row) {
        for (int i = 0; i < row; i++) {
            if (col[i] == col[row]) return false;
            
            if (Math.abs(i - row) == Math.abs(col[i] - col[row])) return false;
        }
        
        return true;
    }
    
    public int solve() {
        col = new int[N];
        count = 0;
        dfs(0);
        
        return count;
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