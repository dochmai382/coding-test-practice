import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Deque<Integer> queue = new ArrayDeque<>();
        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }

        while (queue.size() > 1) {
            queue.poll();

            int tmp = queue.poll();
            queue.offer(tmp);
        }

        System.out.println(queue.poll());
    }
}