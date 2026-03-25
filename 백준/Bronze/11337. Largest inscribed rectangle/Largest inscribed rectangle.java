import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            double result;
            double limit = Math.sqrt(2) * r;
            if (b >= limit) result = 2.0 * r * r;
            else result = (double) b * Math.sqrt(4.0 * r * r - (double) b * b);

            System.out.printf("%.3f\n", result);
        }
    }
}