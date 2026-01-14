import java.util.*;
import java.io.*;

public class Main {
	static int N, M;
	static int[][] map;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	static int cheese = 0;
	
	public static void main(String[] args) throws IOException {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			map = new int[N][M];
			
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < M; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
					if (map[i][j] == 1) cheese++;
				}
			}
			
			int time = 0;
			while (cheese > 0) {
				bfs();
				time++;
			}
			
			System.out.println(time);
		}
	}	
	
	static void bfs() {
		Deque<int[]> q = new ArrayDeque<>();
		int[][] visited = new int[N][M];
		
		q.offer(new int[]{0, 0});
		visited[0][0] = 1;
		
		while (!q.isEmpty()) {
			int[] cur = q.poll();
			
			for (int i = 0; i < 4; i++) {
				int nx = cur[0] + dx[i];
				int ny = cur[1] + dy[i];
				
				if (nx < 0 || ny < 0 || nx >= N || ny >= M) continue;
				
				if (map[nx][ny] == 1) {
					visited[nx][ny]++;
				} else if (visited[nx][ny] == 0 && map[nx][ny] == 0) {
					visited[nx][ny] = 1;
					q.offer(new int[]{nx, ny});
				}
			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (map[i][j] == 1 && visited[i][j] >= 2) {
					map[i][j] = 0;
					cheese--;
				}
			}
		}
	}
}