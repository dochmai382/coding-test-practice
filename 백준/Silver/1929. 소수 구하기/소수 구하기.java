import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        int M, N;
        StringBuilder sb = new StringBuilder();
        
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
        }

        boolean[] isPrime = getIsPrime(N);
        for (int i = M; i <= N; i++) {
            if (isPrime[i]) 
                sb.append(i).append("\n");
        }

        System.out.print(sb);
    }

    private static boolean[] getIsPrime(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        
        return isPrime;
    }
}