class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for (int n = i; n <= j; n++) {
            String str = String.valueOf(n);
            for (int idx = 0; idx < str.length(); idx++) {
                if (str.charAt(idx) - '0' == k) answer++;
            }  
        }
        return answer;
    }
}