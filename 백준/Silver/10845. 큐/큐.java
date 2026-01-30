import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine());
            
            Deque<Integer> queue = new ArrayDeque<>();
            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String comm = st.nextToken();
                
                int out = -2;
                switch (comm) {
                    case "push":
                        queue.offer(Integer.parseInt(st.nextToken()));
                        break;
                    case "pop":
                        out = queue.isEmpty() ? -1 : queue.poll();
                        break;
                    case "size":
                        out = queue.size(); 
                        break;
                    case "empty":
                        out = queue.isEmpty() ? 1 : 0;
                        break;
                    case "front":
                        out = queue.isEmpty() ? -1 : queue.peekFirst();
                        break;
                    case "back":
                        out = queue.isEmpty() ? -1 : queue.peekLast();
                        break;
                }
                
                if (out != -2) sb.append(out).append("\n");
            }
        }
        
        System.out.print(sb);
    }
}