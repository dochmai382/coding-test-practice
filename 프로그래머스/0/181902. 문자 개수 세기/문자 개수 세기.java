class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        
        for (char ch : my_string.toCharArray()) {
            int idx = 0;
            
            if (ch >= 'A' && ch <= 'Z') {
                idx = ch - 'A';
            } else if (ch >= 'a' && ch <= 'z') {
                idx = ch - 'a' + 26;
            }
            answer[idx]++;
        }
        
        return answer;
    }
}