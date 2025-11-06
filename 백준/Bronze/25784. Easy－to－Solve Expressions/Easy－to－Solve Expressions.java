import java.io.*;
import java.util.*;

class Solution {
    private int[] numbers = new int[3];
    
    public void input(BufferedReader br) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 3; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }
    }
    
    private int solve() {
        Arrays.sort(numbers);
        
        if (numbers[0] + numbers[1] == numbers[2]) {
            return 1;
        } else if (numbers[0] * numbers[1] == numbers[2]) {
            return 2;
        } else {
            return 3;
        }
    }
    
    public String getResult() {
        return String.valueOf(solve());
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
            bw.write(sol.getResult());
        }
    }
}