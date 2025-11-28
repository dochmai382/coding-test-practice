import java.io.*;
import java.util.*;

class Solution {
    private long[] arr;
    
    public void input (BufferedReader br) throws IOException {
        int N = Integer.parseInt(br.readLine());
        arr = new long[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }
    }
    
    public String solve() {
        int answerLeft = 0, answerRight = 0;
        long minSum = Long.MAX_VALUE;
        
        int left = 0;
        int right = arr.length - 1;
        
        while (left < right) {
            long sum = arr[left] + arr[right];
            
            if (Math.abs(sum) < Math.abs(minSum)) {
                minSum = sum;
                answerLeft = left;
                answerRight = right;
            }
            
            if (sum == 0) break;
            else if (sum < 0) left++;
            else right--;
        }
        
        return arr[answerLeft] + " " + arr[answerRight];
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
