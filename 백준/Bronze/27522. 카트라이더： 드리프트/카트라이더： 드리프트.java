import java.io.*;
import java.util.*;

class Solution {
    static class Record {
        long time;
        char team;
        
        Record(long time, char team) {
            this.time = time;
            this.team = team;
        }
    }
    
    private List<Record> records = new ArrayList<>();
	private final int[] scores = {10, 8, 6, 5, 4, 3, 2, 1};
    
    public void input(BufferedReader br) throws IOException {
        for (int i = 0; i < 8; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String time = st.nextToken();
            String team = st.nextToken();
            records.add(new Record(stringToLong(time), team.charAt(0)));
        }
    }
    
    private long stringToLong(String time) {
        String[] parts = time.split(":");
        
        int min = Integer.parseInt(parts[0]);
        int sec = Integer.parseInt(parts[1]);
        int ms = Integer.parseInt(parts[2]);
        
        return min * 60 * 1000 + sec * 1000 + ms;
    }
    
    public String solve() {
        Collections.sort(records, (a, b) -> Long.compare(a.time, b.time));
        
        int redScore = 0;
        int blueScore = 0;
        
        for (int i = 0; i < 8; i++) {
            if (records.get(i).team == 'R') {
                redScore += scores[i];
            } else {
                blueScore += scores[i];
            }
        }
        
        if (redScore > blueScore) return "Red";
        else if (blueScore > redScore) return "Blue";
        else return records.get(0).team == 'R' ? "Red" : "Blue";
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
            bw.write(sol.solve());
        }
    }
}