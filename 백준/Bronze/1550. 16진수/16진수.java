import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String hex = br.readLine();
        System.out.println(Integer.parseInt(hex, 16));
    }
}