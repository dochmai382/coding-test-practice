import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());

        long minCost = Long.MAX_VALUE;
        int best = 0;
        
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            long P = Long.parseLong(st.nextToken());
            long K = Long.parseLong(st.nextToken());
            long C = Long.parseLong(st.nextToken());

            long cnt = (Q - 1) / K;
            long cost = P + C * (cnt * (cnt + 1) / 2);

            if (cost < minCost) {
                minCost = cost;
                best = i;
            }
        }

        System.out.println(best + " " + minCost);
    }
}