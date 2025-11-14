import java.util.*;
import java.io.*;

class Solution {
    private int V;
    private List<List<Integer>> graph;
    private StringBuilder sb = new StringBuilder();
    
    public void input(BufferedReader br) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());
        
        graph = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }
        
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        
        for (int i = 1; i < graph.size(); i++) {
            Collections.sort(graph.get(i));
        }
    }
    
    private void dfs(List<List<Integer>> graph, int v, boolean[] visited) {
        visited[v] = true;
        sb.append(v).append(" ");
        
        for (int neighbor: graph.get(v)) {
            if (!visited[neighbor]) {
                dfs(graph, neighbor, visited);
            }
        }
    }
    
    private void bfs(List<List<Integer>> graph, int start) {
        boolean[] visited = new boolean[graph.size()];
        
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;
        
        while (!queue.isEmpty()) {
            int current = queue.poll();
            sb.append(current).append(" ");
            
            for (int neighbor: graph.get(current)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }
    
    public String getResult() {
        boolean[] dfsVisited = new boolean[graph.size()];
        dfs(graph, V, dfsVisited);
        sb.append("\n");
        bfs(graph, V);
        return sb.toString().trim();
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
