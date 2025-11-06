import java.io.*;
import java.util.*;

class Solution {
    private String S;
    private int[] alphabets = new int[26];
    
    public void input(BufferedReader br) throws IOException {
        S = br.readLine();
    }
    
    private void solve() {
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            alphabets[ch - 'a']++;
        }
    }
    
    public String getResult() {
        solve();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            sb.append(alphabets[i]).append(" ");
        }
        return sb.toString().trim();
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