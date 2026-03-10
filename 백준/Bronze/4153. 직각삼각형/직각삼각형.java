import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        while(true) {
            int[] s = new int[3];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 3; i++) {
                s[i] = Integer.parseInt(st.nextToken());
            }

            if (s[0] == 0 && s[1] == 0 && s[2] == 0) break;

            Arrays.sort(s);
            
            if (Math.pow(s[0], 2) + Math.pow(s[1], 2) == Math.pow(s[2], 2))
                sb.append("right\n");
            else sb.append("wrong\n");
        }
        
        System.out.print(sb);
    }
}