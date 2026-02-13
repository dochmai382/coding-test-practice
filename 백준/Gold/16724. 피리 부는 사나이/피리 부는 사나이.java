import java.util.*;
import java.io.*;

class Main {
    static int N, M;
    static int[] parent;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        
        parent = new int[N * M];
        for (int i = 0; i < N * M; i++) {
            parent[i] = i;
        }
        
        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            for (int j = 0; j < M; j++) {
                char dir = input.charAt(j);
                
                int curr = i * M + j;
                int next = getNext(i, j, dir);
                
                union(curr, next);
            }
        }
        
        int cnt = 0;
        for (int i = 0; i < N * M; i++) {
            if (parent[i] == i) cnt++;
        }
        
        System.out.println(cnt);
    }
    
    static int getNext(int r, int c, char dir) {
        int nr = r, nc = c;
        switch(dir) {
            case 'U': nr--; break;
            case 'D': nr++; break;
            case 'L': nc--; break;
            case 'R': nc++; break;
        }
        return nr * M + nc;
    }
    
    static int find(int x) {
        if (parent[x] == x) return x;
        return parent[x] = find(parent[x]);
    }
    
    static void union(int a, int b) {
        int rootA = find(a);
        int rootB = find(b);
        
        if (rootA != rootB) parent[rootA] = rootB;
    }
}