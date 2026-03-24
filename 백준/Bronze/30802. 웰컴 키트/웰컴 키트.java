import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int[] sizes = new int[6];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 6; i++) {
            sizes[i] = Integer.parseInt(st.nextToken());    
        }

        st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        long total = 0;
        for (int s : sizes) {
            if (s == 0) continue;

            total += (s - 1) / t + 1;
        }

        int bPencil = n / p;
        int sPencil = n % p;

        System.out.println(total);
        System.out.printf("%d %d\n", bPencil, sPencil);
        
    }
}