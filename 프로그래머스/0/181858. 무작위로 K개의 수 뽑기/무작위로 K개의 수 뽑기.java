import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        Set<Integer> set = new LinkedHashSet<>();
        
        for (int num: arr) {
            if (set.size() == k) break;
            set.add(num);
        }
        
        List<Integer> list = new ArrayList<>(set);
        while (list.size() < k) {
            list.add(-1);
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}