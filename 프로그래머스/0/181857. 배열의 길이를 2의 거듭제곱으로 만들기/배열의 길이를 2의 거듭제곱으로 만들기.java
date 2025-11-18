import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int len = arr.length;
        int target = 1;
        
        while (target < len) {
            target *= 2;
        }
        
        return Arrays.copyOf(arr, target);
    }
}