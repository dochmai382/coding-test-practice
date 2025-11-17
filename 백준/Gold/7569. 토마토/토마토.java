import java.io.*;
import java.util.*;

class Solution {
    static class Tomato {
        int h;
        int n;
        int m;
        
        Tomato(int h, int n, int m) {
            this.h = h;
            this.n = n;
            this.m = m;
        }
    }
    
    private int M, N, H;
    private int[][][] box;
    
    private final int[] dh = {0, 0, 0, 0, -1, 1};
    private final int[] dn = {-1, 1, 0, 0, 0, 0};
    private final int[] dm = {0, 0, -1, 1, 0, 0};
    
    public void input(BufferedReader br) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());
        
        box = new int[H][N][M];
        
        for (int h = 0; h < H; h++) {
            for (int n = 0; n < N; n++) {
                st = new StringTokenizer(br.readLine());
                for (int m = 0; m < M; m++) {
                    box[h][n][m] = Integer.parseInt(st.nextToken());
                }
            }
        }
    }
    
    private int solve() {
        Queue<Tomato> queue = new LinkedList<>();
        for (int h = 0; h < H; h++) {
            for (int n = 0; n < N; n++) {
                for (int m = 0; m < M; m++) {
                    if (box[h][n][m] == 1) {
                        queue.offer(new Tomato(h, n, m));
                    }
                }
            }
        }
        bfs(queue);
        
        int maxDay = 0;
        for (int h = 0; h < H; h++) {
            for (int n = 0; n < N; n++) {
                for (int m = 0; m < M; m++) {
                    if (box[h][n][m] == 0) return -1;
                    maxDay = Math.max(maxDay, box[h][n][m]);
                }
            }
        }
        return maxDay - 1; //저장될 때부터 모든 토마토가 익어있는 상태이면 0을 출력
    }
    
    private void bfs(Queue<Tomato> q) {
        while (!q.isEmpty()) {
            Tomato curr = q.poll();
            int currH = curr.h;
            int currN = curr.n;
            int currM = curr.m;
            int currDay = box[currH][currN][currM];
            
            for (int i = 0; i < 6; i++) {
                int nextH = currH + dh[i];
                int nextN = currN + dn[i];
                int nextM = currM + dm[i];
                
                if (nextH < 0 || nextH >= H || nextN < 0 || nextN >= N || nextM < 0 || nextM >= M) continue;
                if (box[nextH][nextN][nextM] == -1) continue;
                
                if (box[nextH][nextN][nextM] == 0) {
                    box[nextH][nextN][nextM] = currDay + 1;
                    q.offer(new Tomato(nextH, nextN, nextM));
                }
            }
        }
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