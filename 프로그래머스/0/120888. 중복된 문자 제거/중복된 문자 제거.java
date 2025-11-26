import java.util.*;

class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        Set<Character> set = new LinkedHashSet<>();
        
        for (char ch : my_string.toCharArray()) {
            set.add(ch);
        }
        
        for (char ch : set) {
            sb.append(ch);
        }
        
        return sb.toString();
    }
}