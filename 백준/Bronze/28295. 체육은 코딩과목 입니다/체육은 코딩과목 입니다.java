import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            char[] direction = {'N', 'E', 'S', 'W'};
            int current = 0;

            for (int i = 0; i < 10; i++) {
                int comm = Integer.parseInt(br.readLine());
                if (comm == 1) {
                    current = (current + 1) % 4;
                } else if (comm == 2) {
                    current = (current + 2) % 4;
                } else if (comm == 3) {
                    current = (current + 3) % 4;
                }
            }

            bw.write(direction[current]);
        }
    }
}