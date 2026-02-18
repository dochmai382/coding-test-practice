import java.util.*;
import java.io.*;

class Main {
    static int[][] board = new int[4][4];
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int curr = Integer.parseInt(br.readLine());
        int winner = 0;

        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (winner == 0) {
                board[r][c] = curr;

                if (checkWin(r, c, curr)) winner = curr;
            }

            curr = (curr == 1) ? 2 : 1;
        }
        
        System.out.println(winner);
    }

    static boolean checkWin(int r, int c, int p) {
        if (board[r][1] == p && board[r][2] == p && board[r][3] == p) return true;
        if (board[1][c] == p && board[2][c] == p && board[3][c] == p) return true;
        if (board[1][1] == p && board[2][2] == p && board[3][3] == p) return true;
        if (board[1][3] == p && board[2][2] == p && board[3][1] == p) return true;
        
        return false;
    }
}