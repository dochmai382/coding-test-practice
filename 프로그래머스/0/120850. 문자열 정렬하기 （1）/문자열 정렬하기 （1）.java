import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        List<Integer> list = new ArrayList<>();
        for (char ch : my_string.toCharArray()) {
            if (Character.isDigit(ch)) list.add(ch - '0');
        }
        Collections.sort(list);
        return list.stream().mapToInt(i -> i).toArray();
    }
}