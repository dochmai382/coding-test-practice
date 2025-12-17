import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            StringBuilder sb = new StringBuilder();
            sb.append("n e").append("\n");
            sb.append("- -----------").append("\n");

            double e = 0;
            double factorial = 1;

            for (int n = 0; n <= 9; n++) {
                if (n == 0) factorial = 1;
                else factorial *= n;

                e += 1.0 / factorial;
                if (n < 2) {
                    sb.append(n).append(" ").append((int) e);
                } else if (n == 2) {
                    sb.append(n).append(" ").append(String.format("%.1f", e));
                } else {
                    sb.append(n).append(" ").append(String.format("%.9f", e));
                }
                sb.append("\n");
            }
            
            bw.write(sb.toString());
        }
    }
}