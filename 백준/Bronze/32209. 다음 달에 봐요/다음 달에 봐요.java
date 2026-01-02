import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int Q = Integer.parseInt(br.readLine());
            
            int problem = 0;
            boolean flag = false;
            
            for (int i = 0; i < Q; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int type = Integer.parseInt(st.nextToken());
                int x = Integer.parseInt(st.nextToken());

                if (type == 1) {
                    problem += x;
                } else if (type == 2) {
                    if (problem < x) flag = true;
                    problem -= x;
                }
            }
            
            bw.write(flag ? "Adios" : "See you next month" );
        }
    }
}