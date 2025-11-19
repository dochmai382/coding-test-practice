class Solution {
    public int solution(String[] order) {
        int answer = 0;
        for (String o: order) {
            answer += o.contains("latte") ? 5000 : 4500;
        }
        return answer;
    }
}