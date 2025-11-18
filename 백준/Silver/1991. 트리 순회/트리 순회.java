import java.io.*;
import java.util.*;

class Solution {
    private int[][] tree;
    private StringBuilder sb = new StringBuilder();
    
    public void input(BufferedReader br) throws IOException {
        int N = Integer.parseInt(br.readLine());
        tree = new int[N][2];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            char parent = st.nextToken().charAt(0);
            char left = st.nextToken().charAt(0);
            char right = st.nextToken().charAt(0);
            
            int parentIdx = parent - 'A';
            tree[parentIdx][0] = toIdx(left);
            tree[parentIdx][1] = toIdx(right);
        }
    }
    
    private int toIdx(char ch) {
        if (ch == '.') return -1;
        return ch - 'A';
    }
    
    public String solve() {
        preorder(0);
        sb.append("\n");
        
        inorder(0);
        sb.append("\n");
        
        postorder(0);
        
        return sb.toString().trim();
    }
    
    //preorder (루트) (왼쪽 자식) (오른쪽 자식)
    private void preorder(int idx) {
        if (idx == -1) return;
        sb.append(toChar(idx));
        preorder(tree[idx][0]);
        preorder(tree[idx][1]);
    }
    
    //inorder (왼쪽 자식) (루트) (오른쪽 자식)
    private void inorder(int idx) {
        if (idx == -1) return;
        inorder(tree[idx][0]);
        sb.append(toChar(idx));
        inorder(tree[idx][1]);
    }
    
    //postorder (왼쪽 자식) (오른쪽 자식) (루트)
    private void postorder(int idx) {
        if (idx == -1) return;
        postorder(tree[idx][0]);
        postorder(tree[idx][1]);
        sb.append(toChar(idx));
    }   
    
    private char toChar(int idx) {
        if (idx == -1) return '.';
        return (char)(idx + 'A');
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
			bw.write(sol.solve());
		}
	}
}
