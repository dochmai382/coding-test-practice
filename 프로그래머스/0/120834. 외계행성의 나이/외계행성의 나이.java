
// a = 0, b = 1, ...j = 9
class Solution {
    public String solution(int age) {
        StringBuilder sb = new StringBuilder();
        
        char[] charAge = String.valueOf(age).toCharArray();
        for (char ch: charAge) {
            int num = ch - '0';
            char alphabet = (char) ('a' + num);
            sb.append(alphabet);     
        }
        
        return sb.toString();
    }
}