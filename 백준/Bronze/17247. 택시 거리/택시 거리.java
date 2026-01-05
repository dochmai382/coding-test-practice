import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            List<int[]> list = new ArrayList<>();
            for (int i = 1; i <= N; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 1; j <= M; j++) {
                    if (Integer.parseInt(st.nextToken()) == 1) {
                        list.add(new int[]{i, j});
                    }
                }
                if (list.size() == 2) break;
            }

            int result = Math.abs(list.get(1)[0] - list.get(0)[0]) 
                + Math.abs(list.get(1)[1] - list.get(0)[1]);
            bw.write(String.valueOf(result));
        }
    }
}