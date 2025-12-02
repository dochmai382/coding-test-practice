class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int x = 0, y = 0;
        int maxX = board[0] / 2;
        int maxY = board[1] / 2;
        
        for (String key: keyinput) {
            if (key.equals("up") && y < maxY) y++;
            else if (key.equals("down") && y > -maxY) y--;
            else if (key.equals("left") && x > -maxX) x--;
            else if (key.equals("right") && x < maxX) x++;
            
        }
        
        return new int[]{x, y};
    }
}