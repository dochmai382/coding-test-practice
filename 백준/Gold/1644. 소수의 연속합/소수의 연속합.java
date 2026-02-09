import java.util.*;
import java.io.*;

class Solution {
    int N;
    
    public void input(BufferedReader br) throws IOException {
        N = Integer.parseInt(br.readLine());
    }
    
    public String getResult() {
        List<Integer> primes = findPrimes(N);
        int result = solve(primes);
        return String.valueOf(result);
    }
    
    private int solve(List<Integer> list) {
        int start = 0, end = 0, sum = 0, count = 0;
        
        while (true) {
            if (sum >= N) {
                if (sum == N) count++;
                sum -= list.get(start++);
            } else if (end == list.size()) break;
            else sum += list.get(end++);
        }
        
        return count;
    }
    
    private List<Integer> findPrimes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        
        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }
        
        List<Integer> list = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) list.add(i);
        }
        
        return list;
    }
}

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Solution sol = new Solution();
        sol.input(br);
        System.out.println(sol.getResult());
    }
}