import java.util.*;
import java.io.*;

public class Main {
	static int M, N;
	static int[][] map;
	static boolean[][] visited;
	static int[] dr = {-1,1,0,0};
	static int[] dc = {0,0,-1,1};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		
		map = new int[M][N];
		visited = new boolean[M][N];
		
		for (int i = 0; i < M; i++) {
			String str = br.readLine();
			for (int j = 0; j < N; j++) {
				map[i][j] = str.charAt(j)-'0';
			}
		}
		
		String ans = "NO";
		for (int i = 0; i < N; i++) {
			if (map[0][i] == 0 && !visited[0][i]) {
				visited[0][i] = true;
				if (bfs(0,i)) {
					ans = "YES";
					break;
				}
			}
		}
		
		System.out.println(ans);
	}
	
	static boolean bfs(int x, int y) {
		Queue<Pos> q = new LinkedList<>();
		q.add(new Pos(x,y));
		
		while (!q.isEmpty()) {
			Pos curr = q.poll();
			
			if (curr.x == M-1) 
				return true;
			
			for (int d = 0; d < 4; d++) {
				int nr = curr.x + dr[d];
				int nc = curr.y + dc[d];
				
				if (nr < 0 || nr >= M || nc < 0 || nc >= N) continue;
				
				if (visited[nr][nc] || map[nr][nc] == 1) continue;
				
				visited[nr][nc] = true;
				q.add(new Pos(nr,nc));
			}
		}
		
		return false;
	}
	
	static class Pos {
		int x, y;

		public Pos(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}