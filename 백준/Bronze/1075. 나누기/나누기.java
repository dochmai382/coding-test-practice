import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.parseInt(br.readLine());
            int F = Integer.parseInt(br.readLine());

            N = (N / 100) * 100;

            while (N % F != 0) {
                N++;
            }

            bw.write(String.format("%02d", N % 100));
        }
    }
}