import java.io.*;
import java.util.*;

class Solution {
    static class State {
        int number;
        String command;
        
        State(int number, String command) {
            this.number = number;
            this.command = command;
        }
    }
    
    private StringBuilder sb = new StringBuilder();
    
    public void input(BufferedReader br) throws IOException {
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            solve(A, B);
        }
    }
    
    private void solve(int a, int b) {
        boolean[] visited = new boolean[10000];
        Queue<State> queue = new LinkedList<>();
        queue.add(new State(a, ""));
        visited[a] = true;
        
        while (!queue.isEmpty()) {
            State current = queue.poll();
            int currentNum = current.number;
            String currentCmd = current.command;
            
            if (currentNum == b) {
                sb.append(currentCmd).append("\n");
                return;
            }
            
            char[] commands = {'D', 'S', 'L', 'R'};
            for (char op : commands) {
                int newNum = 0;
                switch(op) {
                    case 'D':
                        newNum = D(currentNum);
                        break;
                    case 'S':
                        newNum = S(currentNum);
                        break;
                    case 'L':
                        newNum = L(currentNum);
                        break;
                    case 'R':
                        newNum = R(currentNum);
                        break;
                }
                
                if (!visited[newNum]) {
                    visited[newNum] = true;
                    String newCmd = currentCmd + op;
                    queue.add(new State(newNum, newCmd));
                }
            }
        }
    }
    
    private int D(int n) {
        return (2 * n) % 10000;
    }
        
    private int S(int n) {
        return (n - 1 + 10000) % 10000;
    }
        
    private int L(int n) {
        return (n % 1000) * 10 + (n / 1000);
    }
        
    private int R(int n) {
        return (n % 10) * 1000 + (n / 10);
    }
    
    public String getResult() {
        return sb.toString().trim();
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