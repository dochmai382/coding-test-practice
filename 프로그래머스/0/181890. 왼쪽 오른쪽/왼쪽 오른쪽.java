import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                if (i == 0) return new String[]{};
                
                return Arrays.copyOfRange(str_list, 0, i);
            } else if (str_list[i].equals("r")) {
                if (i == str_list.length - 1) return new String[]{};
                
                return Arrays.copyOfRange(str_list, i+1, str_list.length);
            }
        }
        return new String[]{};
    }
}