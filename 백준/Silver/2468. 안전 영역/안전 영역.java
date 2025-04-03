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
	
	static int N, max, cnt;
	static int[][] map;
	static boolean[][] visit;
	static int[] dr = {-1,1,0,0};
	static int[] dc = {0,0,-1,1};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		
		map = new int[N][N];
		
		int maxDay = -1;
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				if (map[i][j] > maxDay) maxDay = map[i][j];
			}
		}
		
		max = -1;
		for (int day = 0; day <= maxDay; day++) {
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (map[i][j] == day) 
						map[i][j] = -1;
				}
			}
			
			cnt = 0;
			visit = new boolean[N][N];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (map[i][j] != -1 && !visit[i][j]) {
						visit[i][j] = true;
						bfs(i,j);
						cnt++;
					}
				}
			}
			
			max = Math.max(max, cnt);
		}
		
		System.out.println(max);
	}
	
	static void bfs(int x, int y) {
		Queue<Pos> q = new LinkedList<>();
		q.add(new Pos(x,y));
		
		while (!q.isEmpty()) {
			Pos curr = q.poll();
			
			for (int d = 0; d < 4; d++) {
				int nr = curr.x + dr[d];
				int nc = curr.y + dc[d];
				
				if (nr >= 0 && nr < N && nc >= 0 && nc < N) {
					if (!visit[nr][nc] && map[nr][nc] != -1) {
						visit[nr][nc] = true;
						q.add(new Pos(nr,nc));
					}
				}
			}
		}
	}
}
