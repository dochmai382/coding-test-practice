import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            int D = Integer.parseInt(br.readLine());
            int E = Integer.parseInt(br.readLine());

            for (int i = 0; i < E; i++) {
                char op = br.readLine().charAt(0);
                int Q = Integer.parseInt(br.readLine());

                if (op == '+') {
                    D += Q;
                } else if (op == '-') {
                    D -= Q;
                }
            }

            System.out.println(D);
        }
    }
}