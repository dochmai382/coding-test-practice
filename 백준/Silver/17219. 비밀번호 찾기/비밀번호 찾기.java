import java.io.*;
import java.util.*;

class Solution {
    public String inputAndSolve(BufferedReader br) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        Map<String, String> memo = new HashMap<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            memo.put(st.nextToken(), st.nextToken());
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            String site = br.readLine();
            sb.append(memo.get(site)).append("\n");
        }
        
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
            bw.write(sol.inputAndSolve(br));
        }
    }
}