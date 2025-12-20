import java.util.*;

class Solution {
    private int n, m;
    private int[] result;
    private boolean[][] visited;
            
    private static int[] dr = {-1, 1, 0, 0};
    private static int[] dc = {0, 0, -1, 1};
    
    public int solution(int[][] land) {
        n = land.length;
        m = land[0].length;
        result = new int[m];
        visited = new boolean[n][m];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (land[i][j] == 1 && !visited[i][j]) {
                    bfs(i, j, land);
                }
            }
        }
        
        int answer = 0;
        for (int col : result) {
            answer = Math.max(col, answer);
        }
        
        return answer;
    }
    
    private void bfs(int r, int c, int[][] land) {
        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{r, c});
        visited[r][c] = true;

        
        Set<Integer> cols = new HashSet<>();
        
        int count = 0;
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            count++;
            cols.add(curr[1]);
            
            for (int i = 0; i < 4; i++) {
                int nr = curr[0] + dr[i];
                int nc = curr[1] + dc[i];
                
                if (nr >= 0 && nr < n && nc >= 0 && nc < m) {
                    if (land[nr][nc] == 1 && !visited[nr][nc]) {
                        visited[nr][nc] = true;
                        queue.offer(new int[]{nr, nc});
                    }
                }
            }
        }
        
        for (int col : cols) {
            result[col] += count;
        }
        
    }
}