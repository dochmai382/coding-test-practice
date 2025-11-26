import java.util.*;

class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        
        String[] str = my_string.split("");
        Set<String> set = new LinkedHashSet<>(Arrays.asList(str));
        
        for (String s : set) {
            sb.append(s);
        }
        
        return sb.toString();
    }
}