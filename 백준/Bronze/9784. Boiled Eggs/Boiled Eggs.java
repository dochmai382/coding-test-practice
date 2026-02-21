import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int t = 1; t <= T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int P = Integer.parseInt(st.nextToken());
            int Q = Integer.parseInt(st.nextToken());

            int[] weights = new int[n];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                weights[i] = Integer.parseInt(st.nextToken());
            }
            
            Arrays.sort(weights);

            int count = 0;
            int currWeight = 0;
            boolean stop = false;

            for (int i = 0; i < n; i++) {
                if (!stop && count < P && currWeight + weights[i] <= Q) {
                    currWeight += weights[i];
                    count++;
                } else stop = true;
            }

            sb.append("Case " + t + ": " + count).append("\n");
        }

        System.out.print(sb);
    }
}