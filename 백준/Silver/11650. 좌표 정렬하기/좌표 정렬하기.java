import java.util.*;
import java.lang.*;
import java.io.*;

class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Main {
    public static void main(String[] args) throws IOException {
        List<Point> list = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine());

            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                list.add(new Point(x, y));
            }
        }

        Collections.sort(list, (a, b) -> (a.x == b.x) ? a.y - b.y : a.x - b.x);

        StringBuilder sb = new StringBuilder();
        for (Point p : list) {
            sb.append(p.x).append(" ").append(p.y).append("\n");
        }
        System.out.print(sb);
    }
}