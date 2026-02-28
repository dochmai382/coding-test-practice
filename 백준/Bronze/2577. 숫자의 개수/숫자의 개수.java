import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        int prod = A * B * C;
        
        int[] numbers = new int[10];
        String prodStr = String.valueOf(prod);
        for (char ch : prodStr.toCharArray()) {
            numbers[ch - '0']++;
        }

        StringBuilder sb = new StringBuilder();
        for (int n : numbers) {
            sb.append(n).append("\n");
        }

        System.out.print(sb);
    }
}