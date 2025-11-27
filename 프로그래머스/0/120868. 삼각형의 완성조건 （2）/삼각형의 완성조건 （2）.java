import java.util.*;

class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        int a = sides[0];
        int b = sides[1];
        
        int max_x = a + b - 1; // x < a + b
        int min_x = b - a + 1; // b - a < x
        
        return max_x - min_x + 1;
    }
}