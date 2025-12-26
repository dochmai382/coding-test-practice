import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            String S = br.readLine();
            int T = Integer.parseInt(br.readLine());

            String result = S;
            for (int i = 0; i < T; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int A = Integer.parseInt(st.nextToken());
                int B = Integer.parseInt(st.nextToken());
                result = swap(result, A, B);
            }

            bw.write(result);
        }
    }

    private static String swap(String s, int a, int b) {
        char[] arr = s.toCharArray();
        char tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
        return new String(arr);
    }
}