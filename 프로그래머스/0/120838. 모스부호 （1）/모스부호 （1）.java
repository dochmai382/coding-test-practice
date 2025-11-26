import java.util.*;

class Solution {
    private final String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    
    private Map<String, String> createMorseMap() {
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < morse.length; i++) {
            char ch = (char) ('a' + i);
            map.put(morse[i], String.valueOf(ch));
        }
        return map;
    }
    
    public String solution(String letter) {
        Map<String, String> map = createMorseMap();
        String[] str = letter.split(" ");
        
        StringBuilder sb = new StringBuilder();
        for (String s: str) {
            sb.append(map.get(s));
        }
        
        return sb.toString();
    }
}