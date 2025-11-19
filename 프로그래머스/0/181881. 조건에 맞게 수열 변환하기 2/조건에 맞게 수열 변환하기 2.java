import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        
        while(true) {
            int[] nextArr = Arrays.copyOf(arr, arr.length);
            
            for (int i = 0; i < arr.length; i++) {
                int value = arr[i];
                
                if (value >= 50 && value % 2 == 0) {
                    nextArr[i] = value / 2;
                } else if (value < 50 && value % 2 != 0) {
                    nextArr[i] = value * 2 + 1;
                }
            }
            if (Arrays.equals(arr, nextArr)) return answer;
            
            arr = nextArr;
            answer++;
        } 
    }
}