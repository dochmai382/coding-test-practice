import java.util.*;
import java.io.*;

class Main {
    static StringBuilder sb = new StringBuilder();
    static int[] arr;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        arr = new int[N + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine());
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());

            sb.append(isPell(S, E)).append("\n");
        }

        System.out.print(sb);
    }

    private static int isPell(int s, int e) {
        while (s < e) {
            if (arr[s++] != arr[e--]) return 0;
        }
        return 1;
    }
}