class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        
        int num = 1;
        int row = 0;
        int col = 0;
        
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;
        
        while (num <= n * n) {
            
            while(col <= right) {
                answer[row][col++] = num++;
            }
            row++;
            col--;
            top++;
            if(num > n * n) break;
            
            while (row <= bottom) {
                answer[row++][col] = num++;
            }
            col--;
            row--;
            right--;
            if (num > n * n ) break;
            
            while (col >= left) {
                answer[row][col--] = num++;
            }
            row--;
            col++;
            bottom--;
            if (num > n * n) break;
            
            while (row >= top) {
                answer[row--][col] = num++;
            }
            col++;
            row++;
            left++;
            if (num > n * n) break;
        }
        
        return answer;
    }
}