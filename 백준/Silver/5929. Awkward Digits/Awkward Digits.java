import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String b2N = br.readLine();
        String b3N = br.readLine();

        List<Long> list = new ArrayList<>();
        for (int i = 0; i < b2N.length(); i++) {
            char[] tmp = b2N.toCharArray();
            tmp[i] = (tmp[i] == '0') ? '1' : '0';

            long val = Long.parseLong(new String(tmp), 2);
            list.add(val);
        }

        for (long num : list) {
            String converted = toBase3(num);

            if (converted.length() == b3N.length()) {
                int diff = 0;
                for (int i = 0; i < b3N.length(); i++) {
                    if (converted.charAt(i) != b3N.charAt(i)) diff++;
                }

                if (diff == 1) {
                    System.out.println(num);
                    break;
                }
            }
        }
    }

    private static String toBase3(long num) {
        if (num == 0) return "0";
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            sb.append(num % 3);
            num /= 3;
        }
        return sb.reverse().toString();
    }
}