import java.util.*;
import java.io.*;

public class Main {
	static int M, N;
	static int[][] map;
	static boolean[][] visited;
	static boolean possible = false;
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
		
		for (int i = 0; i < N; i++) {
			if (map[0][i] == 0 && !visited[0][i]) {
				visited[0][i] = true;
				dfs(0,i);
			}
		}
		
		System.out.println(possible ? "YES" : "NO");
	}
	
	static void dfs(int x, int y) {
		if (x == M-1) {
			possible = true;
			return;
		}
		
		for (int d = 0; d < 4; d++) {
			int nr = x + dr[d];
			int nc = y + dc[d];
			
			if (nr < 0 || nr >= M || nc < 0 || nc >= N) continue;
			
			if (visited[nr][nc] || map[nr][nc] == 1) continue;
			
			visited[nr][nc] = true;
			dfs(nr,nc);
		}
	}
}