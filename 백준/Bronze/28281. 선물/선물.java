import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int X = Integer.parseInt(st.nextToken());

            int[] days = new int[N];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                days[i] = Integer.parseInt(st.nextToken());
            }
            
            long price = Long.MAX_VALUE;
            for (int i = 0; i < N - 1; i++) {
                long total = (days[i] + days[i+1]) * X;
                price = Math.min(price, total);
            }

            bw.write(String.valueOf(price));
        }
    }
}