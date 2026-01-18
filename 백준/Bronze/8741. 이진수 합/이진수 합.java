import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int k = Integer.parseInt(br.readLine());

            StringBuilder sb = new StringBuilder();

            for(int i = 0; i < k; i++) {
                sb.append('1');
            }
            for (int i = 0; i < k-1; i++) {
                sb.append('0');
            }

            System.out.println(sb.toString());
        }
    }   
}