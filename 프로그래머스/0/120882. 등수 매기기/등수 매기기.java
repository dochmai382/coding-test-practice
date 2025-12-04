import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        double[] average = new double[score.length];
        for (int i = 0; i < score.length; i++) {
            average[i] = (score[i][0] + score[i][1]) / 2.0;
        }
        
        int[] rank = new int[score.length];
        Arrays.fill(rank, 1);
        
        for(int i = 0; i < score.length; i++) {
            for (int j = 0; j < score.length; j++) {
                if (i == j) continue;
                
                if (average[i] < average[j]) rank[i]++;
            }
        }
        
        return rank;
    }
}