class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String id = id_pw[0];
        String pw = id_pw[1];
        
        for (String[] idpw : db) {
            if (id.equals(idpw[0])) {
                if (pw.equals(idpw[1])) {
                    return "login";
                } else {
                    return "wrong pw";
                }
            }
        }
    
        return "fail";
    }
}