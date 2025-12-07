import java.io.*;
import java.util.*;

class Solution {
    private int N, M;
    private int[] parent;
    private int[] plan;
    
    public void input(BufferedReader br) throws IOException {
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        
        parent = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            parent[i] = i;
        }
        
        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; j++) {
                int isConnected = Integer.parseInt(st.nextToken()); 
                if (isConnected == 1 && i < j) union(i, j);
            }
        }
        
        plan = new int[M];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            plan[i] = Integer.parseInt(st.nextToken());
        }
    }
    
    private void union(int a, int b) {
        a = find(a);
        b = find(b);
        
        if (a != b) parent[a] = b;
    }
    
    private int find(int x) {
        if (parent[x] == x) return x;
        return parent[x] = find(parent[x]);
    }
    
    public String solve() {
        boolean can = true;
        int root = find(plan[0]);
        
        for (int i = 1; i < M; i++) {
            if (find(plan[i]) != root) {
                can = false;
                break;
            }
        }
        
        return can ? "YES" : "NO";
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