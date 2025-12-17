import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int[] arr = new int[7];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 7; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            
            StringBuilder sb = new StringBuilder();
            sb.append(arr[0]).append(" ");
            sb.append(arr[1]).append(" ");
            sb.append(arr[6] - arr[0] - arr[1]);

            bw.write(sb.toString().trim());
        }
    }
}