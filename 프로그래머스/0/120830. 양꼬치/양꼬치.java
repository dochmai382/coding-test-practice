/**
양꼬치 n * 12,000
     - n / 10 * 2000 
음료수 k * 2,000
*/

class Solution {
    public int solution(int n, int k) {
        int answer = n * 12000 + k * 2000 - (n / 10) * 2000;
        return answer;
    }
}