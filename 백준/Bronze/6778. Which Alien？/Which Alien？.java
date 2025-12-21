import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int antenna = Integer.parseInt(br.readLine());
            int eyes = Integer.parseInt(br.readLine());

            StringBuilder sb = new StringBuilder();
            if (antenna >= 3 && eyes <= 4) {
                sb.append("TroyMartian").append("\n");
            }
            if (antenna <= 6 && eyes >= 2) {
                sb.append("VladSaturnian").append("\n");
            }
            if (antenna <= 2 && eyes <= 3) {
                sb.append("GraemeMercurian").append("\n");
            }

            bw.write(sb.toString().trim());
        }
    }
}