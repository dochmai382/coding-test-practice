import java.io.*;
import java.util.*;

class Solution {
    private List<List<Integer>> graph;
    private int[] subtree;
    private boolean[] visited;
    
    public String inputAndSolve(BufferedReader br) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());
        
        graph = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }
        subtree = new int[N+1];
        visited = new boolean[N+1];
        
        for (int i = 0; i < N-1; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        
        dfs(R);
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Q; i++) {
            int query = Integer.parseInt(br.readLine());
            sb.append(subtree[query]).append("\n");
        }
        
        return sb.toString().trim();
    }
    
    private int dfs(int node) {
        visited[node] = true;
        int size = 1;
        
        for (int child : graph.get(node)) {
            if (!visited[child]) size += dfs(child);
        }
        
        subtree[node] = size;
        return size;
    }
}

class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            Solution sol = new Solution();
            bw.write(sol.inputAndSolve(br));
        }
    }
}