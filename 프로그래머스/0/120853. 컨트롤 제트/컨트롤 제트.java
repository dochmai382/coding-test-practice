import java.util.*;

class Solution {
    public int solution(String s) {
        String[] strArr = s.split(" ");
        
        Deque<Integer> stack = new ArrayDeque<>();
        for (String str : strArr) {
            if (str.equals("Z")) {
                stack.removeFirst();
            } else { 
                stack.addFirst(Integer.parseInt(str));
            }
        }
        
        return stack.stream().mapToInt(i -> i).sum();
    }
}