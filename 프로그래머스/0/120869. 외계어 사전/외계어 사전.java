import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        Arrays.sort(spell);
        String target = String.join("", spell);
        
        for (String word: dic) {
            char[] charArr = word.toCharArray();
            Arrays.sort(charArr);
            if (target.equals(new String(charArr))) {
                return 1;
            }
        }
        return 2;
    }
}