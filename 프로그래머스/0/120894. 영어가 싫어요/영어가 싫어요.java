class Solution {
    private final String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    
    public long solution(String numbers) {
        for (int i = 0; i <= 9; i++) {
            numbers = numbers.replace(words[i], String.valueOf(i));
        }
        return Long.parseLong(numbers);
    }
}