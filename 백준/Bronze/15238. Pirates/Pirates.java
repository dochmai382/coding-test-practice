import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int n = Integer.parseInt(br.readLine());
            String input = br.readLine();

            int[] alpha = new int[26];
            for (char ch: input.toCharArray()) {
                alpha[ch - 'a']++;
            }

            int max = 0;
            int index = 0;
            for (int i = 0; i < 26; i++) {
                if (alpha[i] > max) {
                    max = alpha[i];
                    index = i;
                }
            }

            char alphabet = (char) (index + 'a');            
            
            bw.write(alphabet + " " + max);
        }
    }
}