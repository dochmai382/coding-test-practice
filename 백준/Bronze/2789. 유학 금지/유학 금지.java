import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        char[] not = {'C', 'A', 'M', 'B', 'R', 'I', 'D', 'G', 'E'};
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            boolean flag = false;
            char curr = input.charAt(i);
            
            for (int j = 0; j < 9; j++) {
                if (curr == not[j]) {
                    flag = true;
                    break;
                }
            }

            if (!flag) sb.append(curr);
        }

        System.out.println(sb);
    }
}