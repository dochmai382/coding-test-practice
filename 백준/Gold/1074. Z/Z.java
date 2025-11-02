import java.io.*;
import java.util.*;

class Solution {
	private int N;
	private int r;
	private int c;
	private int count = 0;
	
	public void input(BufferedReader br) throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
	}
	
	private void Z(int size, int rStart, int cStart) {
		if (rStart == r && cStart == c) {
			return;
		}
		
		if (!(rStart <= r && r < rStart + size && cStart <= c && c < cStart + size)) {
			count += size * size;
			return;
		}
		
		// 분할 정복 (4등분)
		int newSize = size / 2;
		int area = newSize * newSize;

		if (r < rStart + newSize && c < cStart + newSize) {
			Z(newSize, rStart, cStart);
		} else if (r < rStart + newSize && c >= cStart + newSize) {
			count += area * 1;
			Z(newSize, rStart, cStart + newSize);
		} else if (r >= rStart + newSize && c < cStart + newSize) {
			count += area * 2;
			Z(newSize, rStart + newSize, cStart);
		} else {
			count += area * 3;
			Z(newSize, rStart + newSize, cStart + newSize);
		}
		
	}
	
	public String getResult() {
		int initialSize = (int) Math.pow(2, N);
		Z(initialSize, 0, 0);
		
		return String.valueOf(count);
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