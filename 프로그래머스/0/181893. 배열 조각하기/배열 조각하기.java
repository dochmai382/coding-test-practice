import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        int startIdx = 0;
        int endIdx = arr.length - 1;
        
        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                endIdx = startIdx + query[i];
            } else {
                startIdx = startIdx + query[i];
            }
        }
        
        return Arrays.copyOfRange(arr, startIdx, endIdx + 1);
    }
}