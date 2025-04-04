import java.io.*;
import java.util.*;

public class Solution {
	static int N, K, maxH, ans;
	static int[][] mountain;
	static boolean[][] visited;
	static int[] dr = {-1,1,0,0};
	static int[] dc = {0,0,-1,1};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			N = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());
			
			mountain = new int[N][N];
			visited = new boolean[N][N];
			maxH = 0; ans = 0;
			
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < N; j++) {
					mountain[i][j] = Integer.parseInt(st.nextToken());
					if (mountain[i][j] > maxH) 
						maxH = mountain[i][j];
				}
			}
			
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (mountain[i][j] == maxH) {
						work(i,j,1,false);
					}
				}
			}
			
			System.out.printf("#%d %d\n", tc, ans);
		}
	}
	
	static void work(int r, int c, int dist, boolean isDone) {
		if (dist > ans) ans = dist;
		
		visited[r][c] = true;
		
		for (int d = 0; d < 4; d++) {
			int nr = r + dr[d];
			int nc = c + dc[d];
			
			if (nr >= 0 && nr < N && nc >= 0 && nc < N) {
				if (!visited[nr][nc]) {
					if (mountain[nr][nc] < mountain[r][c])
						work(nr,nc,dist+1,isDone);
					else if (!isDone && mountain[nr][nc] - K < mountain[r][c]) {
						int tmp = mountain[nr][nc];
						mountain[nr][nc] = mountain[r][c] - 1;
						work(nr, nc, dist+1, true);
						mountain[nr][nc] = tmp;
					}
				}
			}
		}
		
		visited[r][c] = false;
	}
}
