import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int n = input.length();

        int[] sum = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            sum[i] = sum[i - 1] + (input.charAt(i - 1) - '0');
        }

        int maxLen = 0;

        for (int i = 1; i <= n/2; i++) {
            for (int j = 0; j <= n-2*i; j++) {
                int first = sum[j + i] - sum[j];
                int second = sum[j + 2 * i] - sum[j + i];

                if (first == second) maxLen = Math.max(maxLen, 2 * i);
            }
        }

        System.out.println(maxLen);
    }
}