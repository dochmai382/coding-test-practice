import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))         
        ) {
            int X = Integer.parseInt(br.readLine());
            int N = Integer.parseInt(br.readLine());

            int total = 0;
            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                total += a * b;
            }

            String result = total == X ? "Yes" : "No";
            bw.write(result);
        }
    }
}