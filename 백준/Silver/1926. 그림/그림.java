import java.io.*;
import java.util.*;

public class Main {
	static class Pos {
		int x, y;

		public Pos(int x, int y) {
			this.x = x;
			this.y = y;
		}	
	}
	
	static int N, M, count, max;
	static int[][] map;
	static boolean[][] visit;
	static int[] dr = {-1,1,0,0};
	static int[] dc = {0,0,-1,1};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		map = new int[N][M];
		visit = new boolean[N][M];
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		max = 0;
		count = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (map[i][j] == 1 && !visit[i][j]) {
					int ans = bfs(i,j);
					count++;
					max = Math.max(max, ans);
				}
			}
		}
		
		System.out.println(count);
		System.out.println(max);
		
	}
	
	static int bfs(int x, int y) {
		Queue<Pos> q = new LinkedList<>();
		q.add(new Pos(x,y));
		
		visit[x][y] = true;
		int cnt = 0;
		
		while (!q.isEmpty()) {
			Pos curr = q.poll();
			cnt++;
			
			for (int d = 0; d < 4; d++) {
				int nr = curr.x + dr[d];
				int nc = curr.y + dc[d];
				
				if (nr < 0 || nr >= N || nc < 0 || nc >= M) continue;
				
				if (visit[nr][nc] || map[nr][nc] == 0) continue;
				
				visit[nr][nc] = true;
				q.add(new Pos(nr,nc));
			}
		}
		
		return cnt;
	}
}
