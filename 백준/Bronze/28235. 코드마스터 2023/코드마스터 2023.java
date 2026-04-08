import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        String result = "";
        switch(input) {
            case "SONGDO":
                result = "HIGHSCHOOL";
                break;
            case "CODE":
                result = "MASTER";
                break;
            case "2023":
                result = "0611";
                break;
            case "ALGORITHM":
                result = "CONTEST";
                break;
        }

        System.out.println(result);
    }
}