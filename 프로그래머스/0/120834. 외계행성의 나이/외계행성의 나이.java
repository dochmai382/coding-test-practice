class Solution {
    public String solution(int age) {
        String answer = "";
        String[] alphabets = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        
        while (age > 0) {
            answer = alphabets[age % 10] + answer;
            age /= 10;
        }
        
        return answer;
    }
}