import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            String start = br.readLine();
            String end = br.readLine();

            int startSec = convertSecond(start);
            int endSec = convertSecond(end);

            int diff = endSec - startSec;
            if (diff < 0) {
                diff += (24 * 3600);
            }

            bw.write(String.valueOf(diff));
        }
    
    }

    private static int convertSecond(String time) {
        String[] parts = time.replace(" ", "").split(":");
        int hour = Integer.parseInt(parts[0]);
        int min = Integer.parseInt(parts[1]);
        int sec = Integer.parseInt(parts[2]);
        return hour * 3600 + min * 60 + sec;
    }
}