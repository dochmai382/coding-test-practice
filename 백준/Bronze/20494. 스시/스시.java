import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int len = 0;
        for (int i = 0; i < N; i++) {
            String B = br.readLine();
            len += B.length();
        }

        System.out.println(len);
    }
}