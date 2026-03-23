import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] stops = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            stops[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(stops);

        int minDist = Integer.MAX_VALUE;
        int count = 0;

        for (int i = 0; i < n - 1; i++) {
            int dist = stops[i + 1] - stops[i];

            if (dist < minDist) {
                minDist = dist;
                count = 1;
            } else if (dist == minDist) {
                count++;
            }
        }
        
        System.out.println(minDist + " " + count);
    }
}