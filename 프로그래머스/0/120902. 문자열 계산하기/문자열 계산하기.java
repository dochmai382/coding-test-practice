class Solution {
    public int solution(String my_string) {
        String[] strArr = my_string.split(" ");
        int answer = Integer.parseInt(strArr[0]);
        
        for (int i = 1; i < strArr.length; i+=2) {
            String op = strArr[i];
            int num = Integer.parseInt(strArr[i + 1]);
            
            if (op.equals("+")) answer += num;
            else answer -= num;
        }
        
        return answer;
    }
}