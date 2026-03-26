import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        boolean[] isPrime = getPrime(B);
        
        int count = 0;
        for (int i = A; i <= B; i++) {
            if (isPrime[i] && hasDigit(i, D)) count++;
        }

        System.out.println(count);
    }

    private static boolean[] getPrime(int n) {
        boolean[] primes = new boolean[n + 1];
        Arrays.fill(primes, true);
        primes[0] = primes[1] = false;
        for (int i = 2; i * i <= n; i++) {
            if (primes[i]) {
                for (int j = i * i; j <= n; j += i) {
                    primes[j] = false;
                }
            }
        }
        return primes;
    }

    private static boolean hasDigit(int num, int target) {
        if (num == 0 && target == 0) return true;
        while (num > 0) {
            if (num % 10 == target) return true;
            num /= 10;
        }
        return false;
    }
}