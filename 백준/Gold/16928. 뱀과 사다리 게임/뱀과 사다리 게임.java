import java.io.*;
import java.util.*;

class Solution {
    private int N, M;
    private int[] board = new int[101];
    private int[] dist = new int[101];
    
    public void input(BufferedReader br) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        
        for (int i = 0; i < N+M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            board[x] = y;
        }
    }
    
    private int bfs() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        dist[1] = 0;
        
        while(!queue.isEmpty()) {
            int current = queue.poll();
            
            if (current == 100) return dist[100];
            
            for (int i = 1; i <= 6; i++) {
                int next = current + i;
                
                if (next > 100) continue;
                
                if(board[next] != 0) {
                    next = board[next];
                }
                
                if (dist[next] == 0) {
                    dist[next] = dist[current] + 1;
                    queue.add(next);
                }
            } 
        }
        
        return 0;
    }
    
    public String getResult() {
        return String.valueOf(bfs());
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