import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int size = emergency.length;
        int[] answer = new int[size];
        
        int[] sorted = emergency.clone();
        Arrays.sort(sorted);
        
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < sorted.length; i++) {
            map.put(sorted[i], size - i);
        }
        
        for (int i = 0; i < size; i++) {
            answer[i] = map.get(emergency[i]);
        }
        
        return answer;
    }
}