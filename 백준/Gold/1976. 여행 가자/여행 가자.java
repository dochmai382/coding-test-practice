import java.io.*;
import java.util.*;

class Solution {
    private int N, M;
    private List<Integer>[] adj;
    private int[] plan;
    
    public void input(BufferedReader br) throws IOException {
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        
        adj = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            adj[i] = new ArrayList<>();
        }
        
        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; j++) {
                int isConnected = Integer.parseInt(st.nextToken()); 
                if (isConnected == 1) adj[i].add(j);
            }
        }
        
        plan = new int[M];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            plan[i] = Integer.parseInt(st.nextToken());
        }
    }
    
    public String solve() {
        boolean can = true;
        
        for (int i = 0; i < M - 1; i++) {
            int startCity = plan[i];
            int endCity = plan[i + 1];
            
            if (!bfs(startCity, endCity)) {
                can = false;
                break;
            }
        }
        
        return can ? "YES" : "NO";
    }
    
    private boolean bfs(int start, int end) {
        if (start == end) return true;
        
        Deque<Integer> queue = new ArrayDeque<>();
        boolean[] visited = new boolean[N + 1];
        
        queue.offer(start);
        visited[start] = true;
        
        while (!queue.isEmpty()) {
            int current = queue.poll();
            
            for (int next : adj[current]) {
                if (next == end) return true;
                
                if (!visited[next]) {
                    visited[next] = true;
                    queue.offer(next);
                }
            }
        }
        
        return false;
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
            bw.write(sol.solve());
        }
    }
}