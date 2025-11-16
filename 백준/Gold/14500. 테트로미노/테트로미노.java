import java.io.*;
import java.util.*;

class Solution {
    private int N, M;
    private int[][] map;
    private boolean[][] visited;
    private int answer = 0;
    private int[] dx = {-1, 1, 0, 0};
    private int[] dy = {0, 0, -1, 1};
    
    public void input(BufferedReader br) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        
        map = new int[N][M];
        visited = new boolean[N][M];
        
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }
    
    private void solve() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                visited[i][j] = true;
                dfs(i, j, 1, map[i][j]);
                visited[i][j] = false;
            
                checkT(i, j);
            }
        }
    }
    
    private void dfs(int x, int y, int depth, int sum) {
        if (depth == 4) {
            answer = Math.max(answer, sum);
            return;
        }
        
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            
            if (nx < 0 || ny < 0 || nx >= N || ny >= M) continue;
            if (!visited[nx][ny]) {
                visited[nx][ny] = true;
                dfs(nx, ny, depth + 1, sum + map[nx][ny]);
                visited[nx][ny] = false;
            }
        }
    }
    
    private void checkT(int x, int y) {
        // ㅏ : 중+위+아래+오
        if (x-1 >= 0 && x+1 < N && y+1 < M) {
            int sum = map[x][y] + map[x-1][y] + map[x+1][y] + map[x][y+1];
            answer = Math.max(sum, answer);
        }
        // ㅓ : 중+위+아래+왼
        if (x-1 >= 0 && y-1 >= 0 && x+1 < N) {
            int sum = map[x][y] + map[x-1][y] + map[x+1][y] + map[x][y-1];
            answer = Math.max(sum, answer);
        }
        // ㅗ : 중+오+왼+위
        if (x-1 >= 0 && y-1 >= 0 && y+1 < M) {
            int sum = map[x][y] + map[x][y+1] + map[x][y-1] + map[x-1][y];
            answer = Math.max(sum, answer);
        }
        // ㅜ : 중+오+왼+아래
        if (y-1 >= 0 && y+1 < M && x+1 < N) {
            int sum = map[x][y] + map[x][y+1] + map[x][y-1] + map[x+1][y];
            answer = Math.max(sum, answer);
        }
    }
    
    public String getResult() {
        solve();
        return String.valueOf(answer);
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