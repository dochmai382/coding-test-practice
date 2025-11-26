class Solution {
    public int solution(int num, int k) {
        String strNum = String.valueOf(num);
        String strK = String.valueOf(k);
        
        int index = strNum.indexOf(strK);
        
        return (index != -1) ? index + 1 : -1;
    }
}