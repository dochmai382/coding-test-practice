import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int sleep = Integer.parseInt(br.readLine());
            int wake = Integer.parseInt(br.readLine());
           
            int time = wake - sleep;
            if (time < 0) time += 24;

            bw.write(String.valueOf(time));
        }
    }    
}