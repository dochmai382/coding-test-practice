import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
        ) {
            int N = Integer.parseInt(br.readLine());
            String A = br.readLine();
            String B = br.readLine();
            
            int count = 0;
            boolean isMismatch = false;
            
            for (int i = 0; i < N; i++) {
                if (A.charAt(i) != B.charAt(i)) {
                    if (!isMismatch) {
                        count++;
                        isMismatch = true;
                    }
                } else isMismatch = false;
            }
            
            System.out.println(count);
        }
    }
}