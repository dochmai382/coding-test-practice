import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                list.add(Integer.parseInt(st.nextToken()));
            }

            for (int i : list) {
                sb.append(i).append(" ");
            }
            sb.append("\n");
            
            boolean has17 = list.contains(17);
            boolean has18 = list.contains(18);

            if (has17 && has18) sb.append("both\n\n");
            else if(has17) sb.append("zack\n\n");
            else if(has18) sb.append("mack\n\n");
            else sb.append("none\n\n");

        }

        System.out.print(sb);
    } 
}