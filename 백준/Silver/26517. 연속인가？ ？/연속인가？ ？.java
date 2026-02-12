import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        long k = Long.parseLong(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long c = Long.parseLong(st.nextToken());
        long d = Long.parseLong(st.nextToken());

        long val1 = (a * k) + b;
        long val2 = (c * k) + d;

        if (val1 == val2) System.out.println("Yes " + val1);
        else System.out.println("No");
    }
}