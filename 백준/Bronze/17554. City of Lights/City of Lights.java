import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        boolean[] lights = new boolean[N+1];
        Arrays.fill(lights, true);

        int k = Integer.parseInt(br.readLine());
        
        int maxOff = 0;
        int currentOff = 0;
        
        while(k-- > 0) {
            int i = Integer.parseInt(br.readLine());

            for (int j = i; j <= N; j += i) {
                if (lights[j]) {
                    lights[j] = false;
                    currentOff++;
                } else {
                    lights[j] = true;
                    currentOff--;
                }
            }

            maxOff = Math.max(currentOff, maxOff);
        }

        System.out.println(maxOff);        
    }
}