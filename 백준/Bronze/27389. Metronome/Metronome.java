import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int n = Integer.parseInt(br.readLine());

            double result = n / 4.0;
            bw.write(String.format("%.2f", result));
        }
    }
}