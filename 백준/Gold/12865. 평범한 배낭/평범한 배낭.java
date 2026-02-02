import java.util.*;
import java.io.*;

class Item {
    int weight;
    int value;

    Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }
}

class Solution {
    int N, K;
    Item[] items;
    
    public void input(BufferedReader br) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        items = new Item[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int w = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            items[i] = new Item(w, v);
        }
    }

    public String solve() {
        int[] dp = new int[K + 1];

        for (int i = 0; i < N; i++) {
            int currW = items[i].weight;
            int currV = items[i].value;

            for (int w = K; w >= currW; w--) {
                dp[w] = Math.max(dp[w], dp[w - currW] + currV);
            }
        }

        return String.valueOf(dp[K]);
    }
    
}

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        Solution sol = new Solution();
        sol.input(br);
        System.out.println(sol.solve());
    }
}