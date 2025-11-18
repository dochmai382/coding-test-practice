class Solution {
    public int[] solution(int[] arr) {
        int len = arr.length;
        int target = 1;
        
        while (target < len) {
            target *= 2;
        }
        
        int answer[] = new int[target];
        System.arraycopy(arr, 0, answer, 0, len);
        
        return answer;
    }
}