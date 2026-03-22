import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        char[] courses = new char[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {   
            courses[i] = st.nextToken().charAt(0);
        }

        char hello = br.readLine().charAt(0);

        int count = 0;
        for (char c : courses) {
            if (hello == c) count++;
        }

        System.out.println(count);
    }
}