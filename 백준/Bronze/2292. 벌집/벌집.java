import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int range = 1;
        int layer = 1;

        if (N == 1) System.out.println(1);
        else {
            while (range < N) {
                range += (layer * 6);
                layer++;
            }
            System.out.println(layer);
        }
    }
}