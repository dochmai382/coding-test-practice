import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            String input = br.readLine();
            int total = 0;
            int score = 1;

            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == 'O') {
                    total += score++;
                } else {
                    score = 1;
                }
            }
            
            sb.append(total).append("\n");
        }

        System.out.print(sb);
    }
}