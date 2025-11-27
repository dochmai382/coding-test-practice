class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int dis = Integer.MAX_VALUE;
        
        for (int num : array) {
            int currentDis = Math.abs(num - n);
            
            if (currentDis < dis) {
                dis = currentDis;
                answer = num;
            } else if (currentDis == dis && num < answer) {
                answer = num;
            }
        }
        
        return answer;
    }
}