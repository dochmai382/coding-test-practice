import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[] image1 = new String[N];
        for (int i = 0; i < N; i++) {
            image1[i] = br.readLine();
        }

        String[] image2 = new String[N];
        for (int i = 0; i < N; i++) {
            image2[i] = br.readLine();
        }

        boolean isEyfa = true;

        for (int i = 0; i < N; i++) {
            String line1 = image1[i];
            String line2 = image2[i];

            for (int j = 0; j < M; j++) {
                char target = line1.charAt(j);
                
                if (target != line2.charAt(2 * j) || target != line2.charAt(2 * j + 1)) {
                    isEyfa = false;
                    break;
                }
            }

            if (!isEyfa) break;
        }

        System.out.println(isEyfa ? "Eyfa" : "Not Eyfa");
    }
}