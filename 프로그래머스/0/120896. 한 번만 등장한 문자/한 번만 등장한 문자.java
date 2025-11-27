import java.util.*;

class Solution {
    public String solution(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch: s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        
        List<Character> list = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                list.add(entry.getKey());
            }
        }
        
        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        for (char ch: list) {
            sb.append(ch);
        }
        
        return sb.toString();
    }
}