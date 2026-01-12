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
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            
            // N! / (A! * B! * C!)
            long result = factorial(N) / (factorial(A) * factorial(B) * factorial(C));
            bw.write(String.valueOf(result));
        }
    }

    private static long factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }
}