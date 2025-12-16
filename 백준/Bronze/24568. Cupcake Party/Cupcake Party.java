import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int R = Integer.parseInt(br.readLine());
            int S = Integer.parseInt(br.readLine());
            
            int remainder = (R * 8 + S * 3) - 28;
            bw.write(String.valueOf(remainder > 0 ? remainder : 0));
        }
    }
}