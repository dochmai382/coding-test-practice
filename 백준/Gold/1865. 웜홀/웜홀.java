import java.util.*;
import java.io.*;

class Edge {
    int start, end, time;
    public Edge(int start, int end, int time) {
        this.start = start;
        this.end = end;
        this.time = time;
    }
}

class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int TC = Integer.parseInt(br.readLine());
            while (TC-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int N = Integer.parseInt(st.nextToken());
                int M = Integer.parseInt(st.nextToken());
                int W = Integer.parseInt(st.nextToken());

                ArrayList<Edge> edges = new ArrayList<>();
                
                for (int i = 0; i < M; i++) {
                    st = new StringTokenizer(br.readLine());
                    int S = Integer.parseInt(st.nextToken());
                    int E = Integer.parseInt(st.nextToken());
                    int T = Integer.parseInt(st.nextToken());

                    edges.add(new Edge(S, E, T));
                    edges.add(new Edge(E, S, T));
                }

                for (int i = 0; i < W; i++) {
                    st = new StringTokenizer(br.readLine());
                    int S = Integer.parseInt(st.nextToken());
                    int E = Integer.parseInt(st.nextToken());
                    int T = Integer.parseInt(st.nextToken());

                    edges.add(new Edge(S, E, -T));
                }

                if (bellmanford(N, edges)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }

    private static boolean bellmanford(int n, ArrayList<Edge> edges) {
        long[] dist = new long[n + 1];

        for (int i = 1; i <= n; i++) {
            boolean updated = false;

            for(Edge e : edges) {
                if (dist[e.end] > dist[e.start] + e.time) {
                    dist[e.end] = dist[e.start] + e.time;
                    updated = true;

                    if (i == n) return true;
                }
            }

            if (!updated) break;
        }

        return false;
    }
}