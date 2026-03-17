import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        long sumLen = 0;
        for (int i = 0; i < n; i++) {
            sumLen += br.readLine().length();
        }

        long totalBlank = L - sumLen;
        int gap = n - 1;

        if (n == 1) {
            System.out.println(L == sumLen ? "Yes" : "No");
        } else {
            if (totalBlank % gap == 0 && totalBlank / gap >= 1) 
                System.out.println("Yes");
            else System.out.println("No");
        }
    }
}