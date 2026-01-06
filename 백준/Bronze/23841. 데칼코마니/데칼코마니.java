import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < N; i++) {
                char[] row = br.readLine().toCharArray();
                
                for (int j = 0; j < M; j++) {
                    if (row[j] != '.') {
                       row[M - 1 - j] = row[j];
                    }
                }
                sb.append(row).append("\n");
            }

            bw.write(sb.toString().trim());
        }
    }
}