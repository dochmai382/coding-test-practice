import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String input;
        while (!(input = br.readLine()).equals("0")) {
            String reversed = new StringBuilder(input).reverse().toString();

            if (input.equals(reversed)) sb.append("yes\n");
            else sb.append("no\n");
        }

        System.out.print(sb);
    }
}