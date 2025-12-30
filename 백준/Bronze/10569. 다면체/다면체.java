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
                StringTokenizer st = new StringTokenizer(br.readLine());
                int V = Integer.parseInt(st.nextToken());
                int E = Integer.parseInt(st.nextToken());

                sb.append(2 - V + E).append("\n");
            }

            bw.write(sb.toString().trim());
        }
    }    
}