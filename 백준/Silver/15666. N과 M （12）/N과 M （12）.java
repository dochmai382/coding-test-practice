import java.util.*;
import java.io.*;

class Main {
    static int N, M;
    static int[] input;
    static int[] result;
    static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) throws IOException {
        Set<Integer> set = new TreeSet<>();
        
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                set.add(Integer.parseInt(st.nextToken()));
            }
        }
        
        input = new int[set.size()];
        int idx = 0;
        for (int num : set) {
            input[idx++] = num;
        }
        
        result = new int[M];
        solve(0, 0);
        
        System.out.print(sb);
    }
    
    private static void solve(int start, int len) {
        if (len == M) {
            for (int num: result) {
                sb.append(num).append(" ");
            }
            sb.append("\n");
            return;
        }
        
        for (int i = start; i < input.length; i++) {
            result[len] = input[i];
            solve(i, len + 1);
        }
    }
}
