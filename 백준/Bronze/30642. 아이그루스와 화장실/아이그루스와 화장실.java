import java.util.*;
import java.io.*;

class Solution {
    private int N, k;
    private String mascot;
    
    public void input(BufferedReader br) throws IOException {
        N = Integer.parseInt(br.readLine());
        mascot = br.readLine();
        k = Integer.parseInt(br.readLine());
    }
    
    public int solve() {
        int target = mascot.equals("annyong") ? 1 : 0;
        int flag = k % 2;
        
        if (target == flag) return k;
        
        boolean isMinusValid = (k - 1) >= 1;
        boolean isPlusValid = (k + 1) <= N;
        
        if (isMinusValid && isPlusValid) return k - 1;
        else if (isMinusValid) return k - 1;
        else return k + 1;
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