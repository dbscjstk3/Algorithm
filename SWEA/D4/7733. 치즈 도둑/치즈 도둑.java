import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	static int N, max, count, ans;
	static int[][] cheese;
	static boolean[][] visit;
	static boolean[][] tmp;
	static int[] dr = {-1,1,0,0};
	static int[] dc = {0,0,-1,1};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			N = Integer.parseInt(br.readLine());
			
			cheese = new int[N][N];
			int maxDay = -1;
			for (int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for (int j = 0; j < N; j++) {
					cheese[i][j] = Integer.parseInt(st.nextToken());
					maxDay = Math.max(maxDay, cheese[i][j]);
				}
			}
			
			max = Integer.MIN_VALUE;
			visit = new boolean[N][N];
			for (int day = 0; day <= maxDay; day++) {
				for (int i = 0; i < N; i++) {
					for (int j = 0; j < N; j++) {
						if (cheese[i][j] == day) {
							visit[i][j] = true;
						}
					}
				}
				
				tmp = new boolean[N][N];
				for (int i = 0; i < N; i++) {
				    tmp[i] = visit[i].clone(); // 각 행을 따로 복사
				}

				
				count = 0;
				for (int i = 0; i < N; i++) {
					for (int j = 0; j < N; j++) {
						if (!tmp[i][j]) {
							dfs(i,j);
							count++;
						}
					}
				}
				
				max = Math.max(max, count);
				if (max == count) ans = count;
			}
			
			System.out.printf("#%d %d\n", tc, ans);
		}
	}
	
	static void dfs(int row, int col) {
		tmp[row][col] = true;
		
		for (int d = 0; d < 4; d++) {
			int nr = row + dr[d];
			int nc = col + dc[d];
				
			if (nr < 0 || nr >= N || nc < 0 || nc >= N) continue;
			if (tmp[nr][nc]) continue;
			
			dfs(nr, nc);
		}
		
		return;
	}
}
