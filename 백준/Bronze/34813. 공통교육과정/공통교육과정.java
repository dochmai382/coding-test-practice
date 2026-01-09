import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
        ) {
            char ch = br.readLine().charAt(0);

            if (ch == 'F') {
                System.out.println("Foundation");
            } else if (ch == 'C') {
                System.out.println("Claves");
            } else if (ch == 'V') {
                System.out.println("Veritas");
            } else if (ch == 'E') {
                System.out.println("Exploration");
            }
        }
    }
}