import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.parseInt(br.readLine());
            int sum = 0;
            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int width = Integer.parseInt(st.nextToken());

                if (width == 136) sum += 1000;
                else if (width == 142) sum += 5000;
                else if (width == 148) sum += 10000;
                else sum += 50000;
            }

            bw.write(String.valueOf(sum));
        }
    }
}