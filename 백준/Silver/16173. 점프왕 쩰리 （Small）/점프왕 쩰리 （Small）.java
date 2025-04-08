import java.util.*;
import java.io.*;

public class Main {
	static int N;
	static int[][] map;
	static boolean[][] visited;
	static int[] dr = {1,0};
	static int[] dc = {0,1};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		
		map = new int[N][N];
		visited = new boolean[N][N];
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		bfs(0,0);
	}
	
	static void bfs(int r, int c) {
		Queue<Pos> q = new LinkedList<>();
		q.add(new Pos(r,c));
		
		while (!q.isEmpty()) {
			Pos curr = q.poll();
			
			if (curr.x == N-1 && curr.y == N-1) {
				System.out.println("HaruHaru");
				return;
			}
			
			for (int d = 0; d < 2; d++) {
				int nr = curr.x + (dr[d] * map[curr.x][curr.y]);
				int nc = curr.y + (dc[d] * map[curr.x][curr.y]);
				
				if (nr < 0 || nr >= N || nc < 0 || nc >= N) continue;
				
				if (visited[nr][nc]) continue;
				
				q.add(new Pos(nr,nc));
				visited[nr][nc] = true;
			}
		}
		
		System.out.println("Hing");
	}
	
	static class Pos {
		int x, y;

		public Pos(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}