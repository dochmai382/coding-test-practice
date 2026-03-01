import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine().replace(" ", "");

        if (input.equals("12345678")) System.out.println("ascending");
        else if (input.equals("87654321")) System.out.println("descending");
        else System.out.println("mixed");
    }
}