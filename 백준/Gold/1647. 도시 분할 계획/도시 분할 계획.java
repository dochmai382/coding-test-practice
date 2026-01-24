import java.util.*;
import java.io.*;

class Edge {
    int u;
    int v;
    int cost;
    
    Edge(int u, int v, int cost) {
        this.u = u;
        this.v = v;
        this.cost = cost;
    }
}

class Solution {
    private List<Edge> edges;
    private int[] parent;
    
    public void input(BufferedReader br) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        parent = new int[N+1];
        for (int i = 1; i <= N; i++) {
            parent[i] = i;
        }

        edges = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            
            edges.add(new Edge(u, v, cost));
        }
    }
    
    public String getResult() {
        return String.valueOf(solve());
    }
    
    private long solve() {
        Collections.sort(edges, (a, b) -> Integer.compare(a.cost, b.cost));
        
        long totalCost = 0;
        int lastCost = 0;
        
        for (Edge e: edges) {
            if (find(e.u) != find(e.v)) {
                union(e.u, e.v);
                totalCost += e.cost;
                lastCost = e.cost;
            }
        }
        
        return totalCost - lastCost;
    }
    
    private int find(int x) {
        if (parent[x] == x) return x;
        return parent[x] = find(parent[x]);
    }
    
    private void union(int a, int b) {
        a = find(a);
        b = find(b);
        if (a != b) parent[b] = a;
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