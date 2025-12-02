import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        Arrays.sort(spell);
        
        for (String word: dic) {
            String[] strArr = word.split("");
            Arrays.sort(strArr);
            if (Arrays.equals(spell, strArr)) {
                return 1;
            }
        }
        return 2;
    }
}