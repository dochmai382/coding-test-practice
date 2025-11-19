import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int i = 0;
        Stack<Integer> stk = new Stack<>();
        
        while (i < arr.length) {
            if (stk.empty()) {
                stk.push(arr[i]);
            } else {
                if (stk.peek() == arr[i]) stk.pop();
                else stk.push(arr[i]);
            }
            i++;
        }
        if (stk.empty()) return new int[]{-1};
        
        return stk.stream().mapToInt(e -> e).toArray();
    }
}