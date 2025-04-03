import java.io.*;
import java.util.*;

public class Main {
	
	static class tomato {
		int x, y, day;

		public tomato(int x, int y, int day) {
			this.x = x;
			this.y = y;
			this.day = day;
		}
	}
	
	static int M, N;
	static int[][] box;
	static int[] dr = {-1,1,0,0};
	static int[] dc = {0,0,-1,1};
	static Queue<tomato> q = new LinkedList<>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		
		box = new int[N][M];
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				box[i][j] = Integer.parseInt(st.nextToken());
				if (box[i][j] == 1) 
					q.add(new tomato(i,j,0));
			}
		}
		
		bfs();
	}
	
	static void bfs() {
		int day = 0;
		
		while (!q.isEmpty()) {
			tomato t = q.poll();
			int row = t.x;
			int col = t.y;
			day = t.day;
			
			for (int d = 0; d < 4; d++) {
				int nr = row + dr[d];
				int nc = col + dc[d];
				
				if (nr >= 0 && nr < N && nc >= 0 && nc < M) {
					if (box[nr][nc] == 0) {
						box[nr][nc] = 1;
						q.add(new tomato(nr,nc,t.day+1));
					}
				}
			}
		}
		
		if (check())
			System.out.println(day);
		else {
			System.out.println(-1);
		}
	}
	
	static boolean check() {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (box[i][j] == 0)
					return false;
			}
		}
		
		return true;
	}
}
