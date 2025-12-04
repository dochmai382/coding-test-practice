class Solution {
    public int solution(String A, String B) {
        if (A.equals(B)) return 0;
        
        int len = A.length();
        
        for (int cnt = 1; cnt < len; cnt++) {
            char lastChar = A.charAt(len - 1);
            String remaining = A.substring(0, len - 1);
            A = lastChar + remaining;
            
            if (A.equals(B)) return cnt;
        }
        
        return -1;
    }
}