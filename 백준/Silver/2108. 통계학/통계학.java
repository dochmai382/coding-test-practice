import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int[] arr = new int[N];
        int[] count = new int[8001];
        
        double sum = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
            count[arr[i] + 4000]++;
        }

        Arrays.sort(arr);
        
        StringBuilder sb = new StringBuilder();
        sb.append(Math.round(sum / N)).append("\n");
        sb.append(arr[N / 2]).append("\n");

        int maxCnt = 0;
        for (int i = 0; i < 8001; i++) {
            if (count[i] > maxCnt) maxCnt = count[i];
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 8001; i++) {
            if (maxCnt == count[i]) list.add(i - 4000);
        }

        if (list.size() > 1) sb.append(list.get(1));
        else sb.append(list.get(0));
        sb.append("\n");

        sb.append(arr[N - 1] - arr[0]).append("\n");

        System.out.print(sb);
    }
}