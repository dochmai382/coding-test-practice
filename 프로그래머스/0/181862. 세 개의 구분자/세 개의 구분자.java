import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String[] parts = myStr.split("[abc]");
        
        String[] answer = Arrays.stream(parts)
            .filter(s -> !s.isEmpty())
            .toArray(String[]::new);
        
        if (answer.length == 0) {
            return new String[]{"EMPTY"};
        }
        return answer;
    }
}