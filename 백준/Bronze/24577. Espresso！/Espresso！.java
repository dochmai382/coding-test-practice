import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        int refills = 0;
        int currentWater = s;
        
        while (n-- > 0) {
            String input = br.readLine();
            
            int need = input.charAt(0) - '0';
            if (input.contains("L")) need++;

            if (currentWater < need) {
                refills++;
                currentWater = s;
            }

            currentWater -= need;
        }

        System.out.println(refills);
    }
}