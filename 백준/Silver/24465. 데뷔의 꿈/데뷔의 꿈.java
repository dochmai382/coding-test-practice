import java.util.*;
import java.io.*;

class Main {
    static final int[] starts = {120, 219, 321, 420, 521, 622, 723, 823, 923, 1023, 1123, 1222};
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        boolean[] exist = new boolean[12];
        for (int i = 0; i < 7; i++) {
            st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            exist[getZodiac(m, d)] = true;
        }

        int N = Integer.parseInt(br.readLine());
        List<Integer> winners = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());

            if (!exist[getZodiac(m, d)]) winners.add(m * 100 + d);
        }

        StringBuilder sb = new StringBuilder();
        if (winners.isEmpty()) sb.append("ALL FAILED\n");
        else {
            Collections.sort(winners);
            for (int date : winners) {
                int m = date / 100;
                int d = date % 100;
                sb.append(m + " " + d).append("\n");
            }
        }
        System.out.print(sb);
    }

    static private int getZodiac(int m, int d) {
        int date = m * 100 + d;

        if (date >= 1222 || date <= 119) return 11;

        for (int i = 0; i < 11; i++) {
            if (date >= starts[i] && date < starts[i + 1]) return i;
        }
        
        return 11;
    }
}