import java.io.*;
import java.util.*;

class Solution {
    private StringBuilder sb = new StringBuilder();
    
    public void inputAndSolve(BufferedReader br) throws IOException {
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int k = Integer.parseInt(br.readLine());
            
            PriorityQueue<Integer> minHeap = new PriorityQueue<>();
            PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
            Map<Integer, Integer> countMap = new HashMap<>();
            
            for (int i = 0; i < k; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                char op = st.nextToken().charAt(0);
                int num = Integer.parseInt(st.nextToken());
                
                switch(op) {
                    case 'I':
                        minHeap.offer(num); maxHeap.offer(num);
                        countMap.put(num, countMap.getOrDefault(num, 0) + 1);
                        break;
                    case 'D':
                        if (countMap.size() == 0) continue;
                        if (num == 1) { // max
                            cleanUp(maxHeap, countMap);
                            if (!maxHeap.isEmpty()) {
                                int max = maxHeap.poll();
                                updateCountMap(countMap, max);
                            }
                            
                        } else if (num == -1) { // min
                            cleanUp(minHeap, countMap);
                            if (!minHeap.isEmpty()) {
                                int min = minHeap.poll();
                                updateCountMap(countMap, min);
                            }
                        }
                        break;
                }
            }
            
            cleanUp(maxHeap, countMap);
            cleanUp(minHeap, countMap);
            
            if (countMap.size() == 0) {
                sb.append("EMPTY");
            } else {
                sb.append(maxHeap.peek()).append(" ").append(minHeap.peek());
            }
            
            sb.append("\n");
        } 
    }
    
    private void cleanUp(PriorityQueue<Integer> heap, Map<Integer, Integer> map) {
        while (!heap.isEmpty() && map.getOrDefault(heap.peek(), 0) == 0) {
            heap.poll();
        }
    }
    
    private void updateCountMap(Map<Integer, Integer> map, int n) {
        map.computeIfPresent(n, (key, count) -> (count == 1) ? null : count - 1);
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