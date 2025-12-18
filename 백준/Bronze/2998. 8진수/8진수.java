import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int[] num = {0, 1, 2, 3, 4, 5, 6, 7};
            
            String input = br.readLine();
            
            int remainder = input.length() % 3;
            if (remainder == 1) input = "00" + input;
            else if(remainder == 2) input = "0" + input;

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < input.length(); i+= 3) {
                String group = input.substring(i, i+3);
                int idx = Integer.parseInt(group, 2);
                sb.append(num[idx]);
            }

            bw.write(sb.toString());
        }
    }
}