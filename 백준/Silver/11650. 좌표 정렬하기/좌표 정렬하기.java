import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        int[][] arr;
        
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine());
            arr = new int[N][2];
            
            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                arr[i][0] = Integer.parseInt(st.nextToken());
                arr[i][1] = Integer.parseInt(st.nextToken());
            }
        }

        Arrays.sort(arr, (a, b) -> (a[0] == b[0]) ? a[1] - b[1] : a[0] - b[0]);

        StringBuilder sb = new StringBuilder();
        for (int[] a : arr) {
            sb.append(a[0]).append(" ").append(a[1]).append("\n");
        }
        System.out.print(sb);
    }
}