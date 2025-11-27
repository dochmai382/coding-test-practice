import java.util.*;
import java.io.*;

class Solution {
    private Map<String, Integer> map = new HashMap<>();
    
    public void input(BufferedReader br) throws IOException {
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String fruit = st.nextToken();
            int quantity = Integer.parseInt(st.nextToken());
            
            map.put(fruit, map.getOrDefault(fruit, 0) + quantity);
        }
    }
    
    public String solve() {
        for (int count : map.values()) {
            if (count == 5) return "YES";
        }
        return "NO";
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