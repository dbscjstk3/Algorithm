import java.util.*;
import java.io.*;

public class Main {
	static int h, w;
	static int[][] map;
	static boolean[][] visited;
	static int[] dr = {-1,-1,-1,0,1,1,1,0};
	static int[] dc = {-1,0,1,1,1,0,-1,-1};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			w = Integer.parseInt(st.nextToken());
			h = Integer.parseInt(st.nextToken());
			
			if (w == 0 && h == 0) break;
			
			map = new int[h][w];
			visited = new boolean[h][w];
			
			for (int i = 0; i < h; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < w; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			int count = 0;
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (map[i][j] == 1 && !visited[i][j]) {
						visited[i][j] = true;
						dfs(i,j);
						count++;
					}
				}
			}
			
			System.out.println(count);
		}
	}
	
	static void dfs(int x, int y) {
		for (int d = 0; d < 8; d++) {
			int nr = x + dr[d];
			int nc = y + dc[d];
			
			if (nr < 0 || nr >= h || nc < 0 || nc >= w) continue;
			
			if (visited[nr][nc] || map[nr][nc] == 0) continue;
			
			visited[nr][nc] = true;
			dfs(nr,nc);
		}
	}
}