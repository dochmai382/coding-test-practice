import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int[] votes = new int[N + 1];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int pick = Integer.parseInt(st.nextToken());
            if (pick != 0) votes[pick]++;
        }

        int maxVote = 0;
        int number = 0;
        boolean isTie = false;

        for (int i = 1; i <= N; i++) {
            if (votes[i] > maxVote) {
                maxVote = votes[i];
                number = i;
                isTie = false;
            } else if (votes[i] == maxVote && maxVote != 0) {
                isTie = true;
            }
        }

        if (isTie || maxVote == 0) System.out.println("skipped");
        else System.out.println(number);
    }
}