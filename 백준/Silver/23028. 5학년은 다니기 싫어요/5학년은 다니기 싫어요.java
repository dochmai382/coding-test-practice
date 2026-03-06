import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int remained = 8 - N;

        for (int i = 0; i < 10; i++) {
            st = new StringTokenizer(br.readLine());
            int X = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken());

            if (i < remained) {
                int major = Math.min(X, 6);
                A += major * 3;
                B += major * 3;

                int r = 6 - major;
                int minor = Math.min(Y, r);
                B += minor * 3;      
            }
        }

        if (A >= 66 && B >= 130) System.out.println("Nice");
        else System.out.println("Nae ga wae");
    }
}