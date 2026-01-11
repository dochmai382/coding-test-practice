import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        int[] score = {6, 3, 2, 1, 2};
        
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 2; i++) {
                int total = 0;
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 5; j++) {
                    total += score[j] * Integer.parseInt(st.nextToken());
                }        
                sb.append(total).append(" ");
            }
            bw.write(sb.toString().trim());
        }
    }
}