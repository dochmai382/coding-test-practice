import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int T = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < T; i++) {
                long N = Long.parseLong(br.readLine());
                long sqrt = (long) Math.sqrt(N);

                if (sqrt * sqrt == N) sb.append(1);
                else sb.append(0);

                sb.append("\n");
            }

            bw.write(sb.toString().trim());
        }
    }
}