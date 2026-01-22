import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            int N = Integer.parseInt(br.readLine());
            String B = br.readLine();
            int M = Integer.parseInt(br.readLine());
            String S = br.readLine();
            
            boolean[] alphabet = new boolean[26];
            for (int i = 0; i < N; i++) {
                alphabet[B.charAt(i) - 'a'] = true;
            } 
            
            for (int i = 0; i < M; i++) {
                if (!alphabet[S.charAt(i) - 'a']) {
                    System.out.println(-1);
                    return;
                }
            }
            
            int count = 0;
            int curr = 0;
            
            for (int i = 0; i < M; i++) {
                char target = S.charAt(i);
                
                while (true) {
                    count++;
                    if (B.charAt(curr) == target) {
                        curr = (curr + 1) % N;
                        break;
                    }
                    curr = (curr + 1) % N;
                }
            }
            
            System.out.println(count);
        }
    }
}