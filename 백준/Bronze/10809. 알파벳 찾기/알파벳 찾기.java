import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();

        int[] alphabets = new int[26];
        Arrays.fill(alphabets, -1);

        for (int i = 0; i < line.length(); i++) {
            int idx = line.charAt(i) - 'a';
            if (alphabets[idx] == -1) alphabets[idx] = i;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            sb.append(alphabets[i]).append(" ");
        }

        System.out.println(sb);
    }
}