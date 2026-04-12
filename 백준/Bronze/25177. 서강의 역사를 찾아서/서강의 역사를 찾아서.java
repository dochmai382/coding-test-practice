import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] current = new int[Math.max(N, M)];
        int[] past = new int[Math.max(N, M)];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            current[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            past[i] = Integer.parseInt(st.nextToken());
        }

        int max = 0;
        for (int i = 0; i < Math.max(N, M); i++) {
            int diff = past[i] - current[i];
            if (diff > max) max = diff;
        }

        System.out.println(max);
    }
}