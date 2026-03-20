import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        int[] months = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] days = {"Wednesday", "Thursday", "Friday", "Saturday", "Sunday", "Monday", "Tuesday"};
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int d = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int totalDay = 0;
        for (int i = 0; i < m; i++) {
            totalDay += months[i];
        }
        totalDay += d;

        System.out.println(days[totalDay % 7]);
    }
}