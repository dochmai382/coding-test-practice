import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int i = 0;
        Deque<Integer> stk = new ArrayDeque<>();
        
        while (i < arr.length) {
            if (stk.isEmpty()) {
                stk.push(arr[i]);
            } else {
                if (stk.peek() == arr[i]) stk.pop();
                else stk.push(arr[i]);
            }
            i++;
        }
        if (stk.isEmpty()) return new int[]{-1};
        
        List<Integer> list = new ArrayList<>(stk);
        Collections.reverse(list);
        
        return list.stream().mapToInt(e -> e).toArray();
    }
}