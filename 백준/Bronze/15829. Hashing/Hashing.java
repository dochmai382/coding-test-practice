import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        String input = br.readLine();

        long sum = 0L;
        long r = 1L;
        int M = 1234567891;

        for (int i = 0; i < L; i++) {
            int value = input.charAt(i) - 'a' + 1;
            sum = (sum + (value * r)) % M;

            r = (r * 31) % M;
        }

        System.out.println(sum);
    }
}