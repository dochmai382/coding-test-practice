import java.io.*;
import java.util.*;

class Solution {
    static class Item {
        int weight;
        int cost;
        double rate;
        
        Item(int weight, int cost) {
            this.weight = weight;
            this.cost = cost;
            this.rate = (double) weight / cost;
        }
    }
    
    public String inputAndSolve(BufferedReader br) throws IOException {
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            List<Item> list = new ArrayList<>();
            for (int j = 0; j < N; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                list.add(new Item(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
            }
            
            Collections.sort(list, (item1, item2) -> {
                if (item1.rate > item2.rate) return -1;
                else if (item1.rate < item2.rate) return 1;
                else return Integer.compare(item1.cost, item2.cost);
            });
            
            sb.append(list.get(0).cost).append("\n");
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
			bw.write(sol.inputAndSolve(br));
		}
	}
}