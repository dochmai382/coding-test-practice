import java.util.*;
import java.io.*;

class Main {
    static class Document {
        int priority;
        int index;
    
        Document(int priority, int index) {
            this.priority = priority;
            this.index = index;
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            Deque<Document> dq = new ArrayDeque<>();
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                dq.offer(new Document(Integer.parseInt(st.nextToken()), i));
            }

            int count = 0;
            while (!dq.isEmpty()) {
                Document curr = dq.poll();
                boolean hasHigher = false;

                for (Document next : dq) {
                    if (next.priority > curr.priority) {
                        hasHigher = true;
                        break;
                    }
                }

                if (hasHigher) dq.offer(curr);
                else {
                    count++;
                    if (curr.index == M) {
                        sb.append(count).append("\n");
                        break;
                    }
                }
            }
        }
        
        System.out.print(sb);
    }
}