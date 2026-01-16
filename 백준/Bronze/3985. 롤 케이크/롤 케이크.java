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
            int[] realCount = new int[N+1];
            
            int expect = 0;
            int expectCnt = -1;
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
                    if (cake[j] == 0) {
                        cake[j] = i;
                        realCount[i]++;
                    }
                }
            }

            int fact = 0;
            int maxFact = -1;
            for (int i = 1; i <= N; i++) {
                if (realCount[i] > maxFact) {
                    maxFact = realCount[i];
                    fact = i;
                }
            }

            System.out.println(expect);
            System.out.println(fact);
        }
    }
}