import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int K = Integer.parseInt(br.readLine());
            int N = Integer.parseInt(br.readLine());
            
            int totalTime = 0;
            int result = -1;
            
            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int time = Integer.parseInt(st.nextToken());
                char answer = st.nextToken().charAt(0);
                
                totalTime += time;
                
                if (totalTime >= 210) {
                    result = K;
                    break;
                }
                
                if (answer == 'T') K = (K % 8) + 1;
            }
            
            bw.write(String.valueOf(result));
        }
    }
}