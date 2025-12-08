import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ){
            int N = Integer.parseInt(br.readLine());
            List<Integer> list = new ArrayList<>();
            
            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int A = Integer.parseInt(st.nextToken());
                int B = Integer.parseInt(st.nextToken());
                
                if (A <= B) list.add(B);
            }
            
            int result = list.isEmpty() ? -1 : Collections.min(list);
            
            bw.write(String.valueOf(result));
        }
    }
}