import java.io.*;
import java.util.*;

class Solution {
    private int R, C;
    private char[][] board;
    private boolean[] visited;
    private int maxMoves = 0;
    
    private final int[] dr = {-1, 1, 0, 0};
    private final int[] dc = {0, 0, -1, 1};
    
    public void input(BufferedReader br) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        
        board = new char[R][C];
        visited = new boolean[26];
        
        for (int i = 0; i < R; i++) {
            char[] arr = br.readLine().toCharArray();
            for (int j = 0; j < C; j++) {
                board[i][j] = arr[j];
            }
        }
    }
    
    private void dfs(int r, int c, int moves) {
        maxMoves = Math.max(maxMoves, moves);
        
        for (int i = 0; i < 4; i++) {
            int nr = r + dr[i];
            int nc = c + dc[i];
            
            if (nr >= 0 && nr < R && nc >= 0 && nc < C) {
                int nextIdx = board[nr][nc] - 'A';
                if (!visited[nextIdx]) {
                    visited[nextIdx] = true;
                    dfs(nr, nc, moves + 1);
                    visited[nextIdx] = false;
                }
            }
        }
    }
    
    public int solve() {
        visited[board[0][0] - 'A'] = true;
        dfs(0, 0, 1);
        return maxMoves;
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