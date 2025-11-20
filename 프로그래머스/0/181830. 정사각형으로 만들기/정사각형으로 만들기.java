import java.util.*;

class Solution {
    public int[][] solution(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        
        if (row == col) return arr;
        
        int maxLen = Math.max(row, col);
        int[][] answer = new int[maxLen][maxLen];
        
        for (int i = 0; i < row; i++) {
            System.arraycopy(arr[i], 0, answer[i], 0, col);
        }
        
        return answer;
    }
}