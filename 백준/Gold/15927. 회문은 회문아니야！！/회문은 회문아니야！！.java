import java.io.*;
import java.util.*;

class Solution {
    private String str;
    
    public void input(BufferedReader br) throws IOException {
        str = br.readLine();
    }
    
    private int solve() {
        int len = str.length();
        
        if (!isPalindrome(str)) {
            return len;
        }
        
        Set<Character> chSet = new HashSet<>();
        for (int i = 0; i < len; i++) {
            chSet.add(str.charAt(i));
        }
        
        if (chSet.size() == 1) {
            return -1;
        } else {
            return len - 1;
        }
    }
    
    private boolean isPalindrome(String s) {
        int len = s.length();
        
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
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
