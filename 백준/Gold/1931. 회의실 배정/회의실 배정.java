import java.io.*;
import java.util.*;

class Solution {
    private int[][] meeting;
    
    public void input(BufferedReader br) throws IOException {
        int N = Integer.parseInt(br.readLine());
        meeting = new int[N][2];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            meeting[i][0] = Integer.parseInt(st.nextToken());
            meeting[i][1] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(meeting, (a, b) -> {
            if (a[1] == b[1]) return a[0] - b[0];
            return a[1] - b[1];
        });
    }
    
    public int solve() {
        int latestEnd = meeting[0][1];
        int count = 1;
        
        for (int i = 1; i < meeting.length; i++) {
            int start = meeting[i][0];
            
            if (start >= latestEnd) {
                count++;
                latestEnd = meeting[i][1];
            }
        }
        
        return count;
    }
}

class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            Solution sol = new Solution();
            sol.input(br);
            bw.write(String.valueOf(sol.solve()));
        }
    }
}