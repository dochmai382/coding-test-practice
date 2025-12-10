import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.parseInt(br.readLine());
            
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < N; i++) {
                String[] parts = br.readLine().split("-");
                int first = calculate(parts[0]);
                int second = Integer.parseInt(parts[1]);
                
                if (Math.abs(first - second) <= 100) sb.append("nice");
                else sb.append("not nice");
                
                sb.append("\n");
            }
            
            bw.write(sb.toString());
        }
    }
    
    private static int calculate(String str) {
        int sum = 0;
        int exp = 2;
        
        for (int i = 0; i < str.length(); i++) {
            int num = str.charAt(i) - 'A';
            sum += (int) (num * Math.pow(26, exp--));
        }
        
        return sum;
    }
}