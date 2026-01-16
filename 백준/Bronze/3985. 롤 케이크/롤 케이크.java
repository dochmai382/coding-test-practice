import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
        ) {
            int L = Integer.parseInt(br.readLine());
            int N = Integer.parseInt(br.readLine());

            int[] cake = new int[L+1];
            
            int expect = 0;
            int expectCnt = Integer.MIN_VALUE;
            for (int i = 1; i <= N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int P = Integer.parseInt(st.nextToken());
                int K = Integer.parseInt(st.nextToken());

                int cnt = K - P + 1;
                if (cnt > expectCnt) {
                    expectCnt = cnt;
                    expect = i;
                }

                for (int j = P; j <= K; j++) {
                    if (cake[j] == 0) cake[j] = i;
                }
            }

            int fact = 0;
            int result = Integer.MIN_VALUE;
            for (int i = 1; i <= N; i++) {
                int cnt = 0;
                for (int j = 1; j <= L; j++) {
                    if (cake[j] == i) cnt++;
                }
                if (cnt > result) {
                    result = cnt;
                    fact = i;
                }
            }

            System.out.println(expect);
            System.out.println(fact);
        }
    }
}