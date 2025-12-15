import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String inputAndSolve(BufferedReader br) throws IOException {
        int T = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        for (int t = 0; t < T; t++) {
            String p = br.readLine();
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();
            
            int[] x;  
            if (n == 0) {
                x = new int[0];
            } else {
                String[] strArr = s.replaceAll("[\\[\\]]", "").split(",");
                x = new int[strArr.length];
                for (int i = 0; i < x.length; i++) {
                    x[i] = Integer.parseInt(strArr[i].trim());
                }
            }
            
            sb.append(solve(p, x)).append("\n");
        }
    
        return sb.toString();
    }
    
    private String solve(String command, int[] arr) {
        Deque<Integer> dq = new ArrayDeque<>();
        for (int num : arr) {
            dq.offer(num);
        }
        
        boolean check = true;
        for (char c : command.toCharArray()) {
            if (c == 'R') {
                check = !check;
            } else if (c == 'D') {
                if (dq.isEmpty()) return "error";
                
                if (check) dq.removeFirst();
                else dq.removeLast();
            }
        }
        
        ArrayList<Integer> list = new ArrayList<>(dq);
        if(!check) Collections.reverse(list);
        
        String elements = list.stream()
            .map(String::valueOf)
            .collect(Collectors.joining(","));
        
        return "[" + elements + "]";
    }
}

class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            Solution sol = new Solution();
            bw.write(sol.inputAndSolve(br));
        }
    }
}