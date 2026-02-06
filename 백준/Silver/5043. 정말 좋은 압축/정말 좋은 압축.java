import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        long N = Long.parseLong(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        // 2^(b+1) - 1
        long max = 1;
        for (int i = 0; i < b + 1; i++) {
            max *= 2;
        }
        max -= 1;

        if (N <= max) System.out.println("yes");
        else System.out.println("no");
    }
}