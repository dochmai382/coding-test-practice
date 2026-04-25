import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= K; i++) {
            int h = Integer.parseInt(br.readLine());
            String input = br.readLine();
            for (char c : input.toCharArray()) {
                if (c == 'c') h++; // h - 1 + 2;
                else h--;
            }
            
            sb.append("Data Set ").append(i).append(":\n");
            sb.append(h).append("\n\n");
        }

        System.out.print(sb.toString().trim());
    }
}