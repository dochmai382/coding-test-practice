import java.io.*;
import java.util.*;

class Solution {
    private StringBuilder sb = new StringBuilder();
    
    public void inputAndSolve(BufferedReader br) throws IOException {
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int k = Integer.parseInt(br.readLine());
            TreeMap<Integer, Integer> map = new TreeMap<>();
           
            for (int i = 0; i < k; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                char op = st.nextToken().charAt(0);
                int num = Integer.parseInt(st.nextToken());
                
                if (op == 'I') {
                    map.put(num, map.getOrDefault(num, 0) + 1);
                } else if (op == 'D') {
                    if (map.isEmpty()) continue;
                    
                    int target = (num == 1) ? map.lastKey() : map.firstKey();
                    if (map.get(target) == 1) {
                        map.remove(target);
                    } else {
                        map.put(target, map.get(target) - 1);
                    }
                }
            }
            
            if (map.isEmpty()) {
                sb.append("EMPTY");
            } else {
                sb.append(map.lastKey()).append(" ").append(map.firstKey());
            }
            
            sb.append("\n");
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