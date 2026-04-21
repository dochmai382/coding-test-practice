import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int[] rings = new int[N];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            rings[i] = Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < N; i++) {
            int gcd = getGCD(rings[0], rings[i]);
            sb.append(rings[0] / gcd).append("/").append(rings[i] / gcd).append("\n");
        }
        
        System.out.print(sb);
    }

    private static int getGCD(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;            
        }
        return a;
    }
}