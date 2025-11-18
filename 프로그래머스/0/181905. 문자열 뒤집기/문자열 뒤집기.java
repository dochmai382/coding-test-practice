class Solution {
    public String solution(String my_string, int s, int e) {
        String sub = my_string.substring(s, e + 1);
        StringBuilder sb = new StringBuilder(sub).reverse();
        
        return my_string.substring(0, s) 
            + sb.toString() 
            + my_string.substring(e + 1);        
    }
}