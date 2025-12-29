import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int aX = Integer.parseInt(st.nextToken());
            int aY = Integer.parseInt(st.nextToken());
            int aZ = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            int cX = Integer.parseInt(st.nextToken());
            int cY = Integer.parseInt(st.nextToken());
            int cZ = Integer.parseInt(st.nextToken());
            
            int bX = cX - aZ;
            int bY = cY / aY;
            int bZ = cZ - aX;

            bw.write(String.format("%d %d %d", bX, bY, bZ));
        }
    }
}