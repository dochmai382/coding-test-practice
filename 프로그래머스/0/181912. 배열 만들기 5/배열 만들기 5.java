import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();
        for (String str : intStrs) {
            int intNum = Integer.parseInt(str.substring(s, s+l));
            if (intNum > k) {
                list.add(intNum);
            }
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}