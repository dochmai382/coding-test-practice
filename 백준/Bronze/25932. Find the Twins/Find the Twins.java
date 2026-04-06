import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (n-- > 0) {
            String line = br.readLine();
            sb.append(line).append("\n");
            
            StringTokenizer st = new StringTokenizer(line);
            
            boolean has17 = false;
            boolean has18 = false;
            
            for (int i = 0; i < 10; i++) {
                int num = Integer.parseInt(st.nextToken());
                if (num == 17) has17 = true;
                if (num == 18) has18 = true;
            }
            
            if (has17 && has18) sb.append("both\n\n");
            else if(has17) sb.append("zack\n\n");
            else if(has18) sb.append("mack\n\n");
            else sb.append("none\n\n");
        }

        System.out.print(sb);
    } 
}