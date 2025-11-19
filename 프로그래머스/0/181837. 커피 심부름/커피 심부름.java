class Solution {
    public int solution(String[] order) {
        // 아메4500, 라떼5000
        int americano = 0;
        int latte = 0;
        int anything = 0;
        for (String o : order) {
            if (o.contains("americano")) americano++;
            else if (o.contains("latte")) latte++;
            else anything++;
        }
        return (americano + anything) * 4500 + latte * 5000;
    }
}