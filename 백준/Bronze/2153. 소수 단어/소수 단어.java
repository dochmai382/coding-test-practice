import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        int sum = 0;
        for (char ch: word.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') sum += (ch - 'a' + 1);
            else if(ch >= 'A' && ch <= 'Z') sum += (ch - 'A' + 27);
        }

        System.out.println(isPrime(sum) ? "It is a prime word." : "It is not a prime word.");
        
    }

    private static boolean isPrime(int n) {
        if (n == 1) return true;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}