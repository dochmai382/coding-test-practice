import java.io.*;
import java.util.*;

class Solution {
    private int n;
    private char[][] page;
    
    public void input(BufferedReader br) throws IOException {
        n = Integer.parseInt(br.readLine());
    }
    
    private void init() {
        page = new char[n][2*n-1];
        for (int i = 0; i < n; i++) {
            Arrays.fill(page[i], ' ');
        }
    }
    
    public String getResult() {
        init();
        solve(n, 0, n-1);
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(page[i]).append('\n');
        }
        
        return sb.toString();
    }
    
    private void solve(int n, int row, int col) {
        if (n == 3) {
            page[row][col] = '*';
            page[row+1][col-1] = '*';
            page[row+1][col+1] = '*';
            for (int i = -2; i <= 2; i++) {
                page[row+2][col+i] = '*';
            }
            return;
        }
        
        int nextN = n / 2;
        solve(nextN, row, col);
        solve(nextN, row+nextN, col-nextN);
        solve(nextN, row+nextN, col+nextN);
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