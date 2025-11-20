import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] dice = {a, b, c, d};
        
        Map<Integer, Integer> counts = new HashMap<>();
        for (int num: dice) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }
        
        int size = counts.size();
        
        if (size == 1) {
            int p = counts.keySet().iterator().next();
            return 1111 * p;
            
        } else if (size == 2) {
            
            if (counts.containsValue(3)) {
                int p = 0; int q = 0;
                for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
                    if (entry.getValue() == 3) {
                        p = entry.getKey();
                    } else {
                        q = entry.getKey();
                    }
                }
                return (int) Math.pow(10 * p + q, 2);
                
            } else {
                Iterator<Integer> it = counts.keySet().iterator();
                int p = it.next();
                int q = it.next();
                
                return (p + q) * Math.abs(p - q);
            }
            
        } else if (size == 3) {
            int product = 1;
            for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
                if (entry.getValue() == 1) {
                    product *= entry.getKey();
                }
            }
            return product;
            
        } else {
            return Arrays.stream(dice).min().getAsInt();
        }
    }
}