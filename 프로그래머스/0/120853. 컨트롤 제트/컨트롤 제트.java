class Solution {
    public int solution(String s) {
        String[] strArr = s.split(" ");
        
        int answer = Integer.parseInt(strArr[0]);
        int idx = 1;
        
        while (idx < strArr.length) {
            if (strArr[idx].equals("Z")) {
                answer -= Integer.parseInt(strArr[idx - 1]);
            } else {
                answer += Integer.parseInt(strArr[idx]);
            }
            
            idx++;
        }
        
        return answer;
    }
}