import java.io.*;
import java.util.*;

class Solution {
    private Set<Integer> set = new HashSet<>();
    
    public void inputAndSolve(BufferedReader br) throws IOException {
        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(br.readLine());
            set.add(num % 42);
        }
    }
    
    public String getResult() {
        return String.valueOf(set.size());
    }
}

class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            Solution sol = new Solution();
            sol.inputAndSolve(br);
            bw.write(sol.getResult());
        }
    }
}