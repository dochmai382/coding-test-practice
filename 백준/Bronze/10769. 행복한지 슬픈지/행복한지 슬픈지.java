import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            String[] emoticons = {":-)", ":-("};
            int happy = 0;
            int sad = 0;
            
            String input = br.readLine();
            for (int i = 0; i <= input.length() - 3; i++) {
                String sub = input.substring(i, i+3);
                if (sub.equals(emoticons[0])) happy++;
                else if (sub.equals(emoticons[1])) sad++;
            }

            String result;
            if (happy == 0 && sad == 0) result = "none";
            else if (happy == sad) result = "unsure";
            else if (happy > sad) result = "happy";
            else result = "sad";

            bw.write(result);
        }
    }
}