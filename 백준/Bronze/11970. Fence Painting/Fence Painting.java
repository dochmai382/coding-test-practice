import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());

            int overStart = Math.max(a, c);
            int overEnd = Math.min(b, d);
            
            int overLen = 0;
            if (overEnd > overStart) overLen = overEnd - overStart;
            
            int result = (b - a) + (d - c) - overLen;
            
            bw.write(String.valueOf(result));
        }
    }
}