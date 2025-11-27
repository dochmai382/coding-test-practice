class Solution {
    public int solution(String my_string) {
        int answer = 0;
        int idx = 0;
        while (idx < my_string.length()) {
            char ch = my_string.charAt(idx);
            if (!Character.isDigit(ch)) {
                idx++;
                continue;
            }
            
            String numStr = "";
            while (idx < my_string.length() && Character.isDigit(my_string.charAt(idx))) {
                numStr += my_string.charAt(idx);
                idx++;
            }
            
            answer += Integer.parseInt(numStr);            
        }
        
        return answer;
    }
}