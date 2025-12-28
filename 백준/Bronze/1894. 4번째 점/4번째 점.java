import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            StringBuilder sb = new StringBuilder();

            String input;
            while((input = br.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(input);
                
                double[][] p = new double[4][2];
                for (int i = 0; i < 4; i++) {
                    p[i][0] = Double.parseDouble(st.nextToken());
                    p[i][1] = Double.parseDouble(st.nextToken());
                }

                double ax, ay, bx, by, cx, cy;

                if (p[0][0] == p[2][0] && p[0][1] == p[2][1]) {
                    cx = p[0][0]; cy = p[0][1];
                    ax = p[1][0]; ay = p[1][1];
                    bx = p[3][0]; by = p[3][1];
                } else if (p[0][0] == p[3][0] && p[0][1] == p[3][1]) {
                    cx = p[0][0]; cy = p[0][1];
                    ax = p[1][0]; ay = p[1][1];
                    bx = p[2][0]; by = p[2][1];
                } else {
                    cx = p[1][0]; cy = p[1][1];
                    ax = p[0][0]; ay = p[0][1];
                    if (p[1][0] == p[2][0] && p[1][1] == p[2][1]) {
                        bx = p[3][0]; by = p[3][1];
                    } else {
                        bx = p[2][0]; by = p[2][1];
                    } 
                }
                double dx = ax + bx - cx;
                double dy = ay + by - cy;

                sb.append(String.format("%.3f %.3f\n", dx, dy));
            }

            bw.write(sb.toString().trim());
        }
    }
}