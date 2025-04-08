import java.util.*;
import java.io.*;

public class Main {
	static int N;
	static int[][] map;
	static boolean visit = false;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		
		map = new int[N][N];
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		dfs(0,0);
		if (!visit) System.out.println("Hing");
	}
	
	static void dfs(int x, int y) {
		if (map[x][y] == -1) {
			System.out.println("HaruHaru");
			visit = true;
		}
		else {
			int n = map[x][y];
			if (n == 0)
				return;
			if (n + x < N) 
				dfs(x+n, y);
			if (n + y < N)
				dfs(x, y+n);
		}
	}
}