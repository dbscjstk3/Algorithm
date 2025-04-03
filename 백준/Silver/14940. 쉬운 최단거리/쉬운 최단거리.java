import java.io.*;
import java.util.*;

public class Main {
	static class Pos {
		int x, y, dist;

		public Pos(int x, int y, int dist) {
			this.x = x;
			this.y = y;
			this.dist = dist;
		}	
	}
	
	static int N, M;
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
		
		int row = 0, col = 0;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				if (map[i][j] == 2) {
					row = i;
					col = j;
				}
			}
		}
		
		bfs(row,col);
		print();
		
	}
	
	static void bfs(int x, int y) {
		Queue<Pos> q = new LinkedList<>();
		q.add(new Pos(x,y,0));
		
		visit[x][y] = true;
		
		while (!q.isEmpty()) {
			Pos curr = q.poll();
			map[curr.x][curr.y] = curr.dist; 
			
			for (int d = 0; d < 4; d++) {
				int nr = curr.x + dr[d];
				int nc = curr.y + dc[d];
				
				if (nr < 0 || nr >= N || nc < 0 || nc >= M) continue;
				
				if (visit[nr][nc] || map[nr][nc] != 1) continue;
				
				visit[nr][nc] = true;
				q.add(new Pos(nr,nc,curr.dist+1));
			}
		}
	}
	
	static void print() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (map[i][j] == 1 && !visit[i][j])
					sb.append(-1 + " ");
				else
					sb.append(map[i][j] + " ");
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}
