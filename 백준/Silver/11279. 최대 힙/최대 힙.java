import java.io.*;
import java.util.*;

class Solution {
    private StringBuilder sb = new StringBuilder();
    
    public void inputAndSolve(BufferedReader br) throws IOException {
        int N = Integer.parseInt(br.readLine());
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(br.readLine());
            if (x == 0) {
                sb.append(pq.isEmpty() ? 0 : pq.poll()).append("\n");
            } else {
                pq.add(x);
            }
        }
    }
    
    public String getResult() {
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
			sol.inputAndSolve(br);
			bw.write(sol.getResult());
		}
	}
}