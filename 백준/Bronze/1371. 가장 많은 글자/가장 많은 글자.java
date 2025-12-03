import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int[] count = new int[26];
            String line;
            
            while ((line = br.readLine()) != null) {
                for (char c : line.toCharArray()) {
                    if (c >= 'a' && c <= 'z') count[c - 'a']++;
                }
            }
            
            int maxCount = 0;
            for (int cnt : count) {
                if (cnt > maxCount) maxCount = cnt;
            }
            
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                if (count[i] == maxCount) sb.append((char) (i + 'a'));
            }
            
            bw.write(sb.toString());
        }
    }
}