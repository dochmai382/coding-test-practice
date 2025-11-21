import java.io.*;
import java.util.*;

class Solution {
    private int N;
    private int[][] paper;
    private int white, blue;
    
    public void input(BufferedReader br) throws IOException {
        N = Integer.parseInt(br.readLine());
        paper = new int[N][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }
    
    private boolean isAllSameColor(int r, int c, int size) {
        int color = paper[r][c];
        
        for (int i = r; i < r + size; i++) {
            for (int j = c; j < c + size; j++) {
                if (paper[i][j] != color) return false;
            }
        }
        return true;
    }
    
    private void divideAndConquer(int r, int c, int size) {
        if (isAllSameColor(r, c, size)) {
            if (paper[r][c] == 0) white++;
            else blue++;
            return;
        }
        
        int half = size / 2;
        divideAndConquer(r, c, half);
        divideAndConquer(r, c + half, half);
        divideAndConquer(r + half, c, half);
        divideAndConquer(r + half, c + half, half);
    }
    
    public String getResult() {
        divideAndConquer(0, 0, N);
        return white + "\n" + blue;
    }
}

class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            Solution sol = new Solution();
            sol.input(br);
            bw.write(sol.getResult());
        }
    }
}