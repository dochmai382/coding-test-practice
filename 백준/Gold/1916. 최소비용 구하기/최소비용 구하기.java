import java.util.*;
import java.io.*;

class Edge {
    int to;
    long cost;
    
    Edge(int to, long cost) {
        this.to = to;
        this.cost = cost;
    }
}

class Solution {
    int N, M;
    int start, end;
    List<List<Edge>> graph;
    
    final long INF = Long.MAX_VALUE;
    
    public void input(BufferedReader br) throws IOException {
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        
        graph = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }
        
        StringTokenizer st;
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            long c = Long.parseLong(st.nextToken());
            
            graph.get(s).add(new Edge(e, c));
        }
        
        st = new StringTokenizer(br.readLine());
        start = Integer.parseInt(st.nextToken());
        end = Integer.parseInt(st.nextToken());
    }
    
    private long solve() {
        long[] dist = new long[N + 1];
        Arrays.fill(dist, INF);
        
        PriorityQueue<Edge> pq = new PriorityQueue<>((e1, e2) -> Long.compare(e1.cost, e2.cost));
        dist[start] = 0;
        pq.add(new Edge(start, 0));
        
        while (!pq.isEmpty()) {
            Edge curr = pq.poll();
            int currCity = curr.to;
            long currCost = curr.cost;
            
            if (currCost > dist[currCity]) continue;
            
            for (Edge next : graph.get(currCity)) {
                int nextCity = next.to;
                long nextCost = next.cost;
                
                long newCost = currCost + nextCost;
                if (newCost < dist[nextCity]) {
                    dist[nextCity] = newCost;
                    pq.add(new Edge(nextCity, newCost));
                }
            }
        }
        
        return dist[end];
    }
    
    public String getResult() {
        return String.valueOf(solve());
    }
}

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        Solution sol = new Solution();
        sol.input(br);
        System.out.println(sol.getResult());
    }
}

