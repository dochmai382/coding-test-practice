import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        Map<String, String> map = new HashMap<>();

        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String firstName = st.nextToken();
            String lastName = st.nextToken();

            map.put(firstName, lastName);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String firstName = st.nextToken();
            String accountName = st.nextToken();

            sb.append(map.get(firstName)).append(" ").append(accountName).append("\n");
        }
        
        System.out.print(sb);
    }
}