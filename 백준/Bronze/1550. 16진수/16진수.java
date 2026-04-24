import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String hex = br.readLine();

        int decimal = 0;
        for (char c: hex.toCharArray()) {
            int value;

            if ('0' <= c && c <= '9') value = c - '0';
            else value = c - 'A' + 10;

            decimal = decimal * 16 + value;
        }

        System.out.println(decimal);
    }
}