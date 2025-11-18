class Solution {
    public String solution(String myString, String pat) {
        int patIndex = myString.lastIndexOf(pat);
        return myString.substring(0, patIndex + pat.length());
    }
}