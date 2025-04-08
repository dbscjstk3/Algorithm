import java.util.*;
import java.io.*;

public class Main {
	static int N, M;
	static int[][] map;
	static boolean[][] visited;
	static boolean visit = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		map = new int[M][N];
		visited = new boolean[M][N];

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		dfs(0, 0);
		System.out.println(visit ? "Yes" : "No");
	}

	static void dfs(int x, int y) {
		if (x == M - 1 && y == N - 1) {
			visit = true;
			return;
		}
		
		visited[x][y] = true;
		
		if (x + 1 < M && map[x + 1][y] == 1 && !visited[x+1][y])
			dfs(x + 1, y);
		if (y + 1 < N && map[x][y + 1] == 1 && !visited[x][y+1])
			dfs(x, y + 1);
	}
}