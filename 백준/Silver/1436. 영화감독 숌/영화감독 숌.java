import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        int name = 666;
        int count = 0;

        while (true) {
            if (String.valueOf(name).contains("666")) count++;
            if (count == N) break;
            name++;
        }

        System.out.println(name);
    }
}