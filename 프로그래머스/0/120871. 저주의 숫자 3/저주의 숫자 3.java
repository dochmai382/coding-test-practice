class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 0;
        
        while (count < n) {
            answer++;
            
            do {
                boolean isDivisible = (answer % 3 == 0);
                boolean containsThree = String.valueOf(answer).contains("3");
                
                if (isDivisible || containsThree) answer++;
                else break;
                
            } while(true);
            
            count++;
        }
        return answer;
    }
}