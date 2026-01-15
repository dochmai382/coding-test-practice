import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());
            String list = br.readLine();
            
            int count = 0;
            for (int i = 0; i <= n-4; i++) {
                if (list.substring(i, i+4).equals("pPAp")) {
                    count++;
                    i+=3;
                }
            }
            
            System.out.println(count);
        }
    }
}