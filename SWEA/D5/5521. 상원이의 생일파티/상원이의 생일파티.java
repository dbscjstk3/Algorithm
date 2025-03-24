import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Solution {
	static int[][] graph;
	static int V, E, count;
	static StringTokenizer st;
	static boolean[] visit;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine());
			V = Integer.parseInt(st.nextToken());
			E = Integer.parseInt(st.nextToken());
			graph = new int[V+1][V+1];
			visit = new boolean[V+1];
			
			for (int i = 0; i < E; i++) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				
				graph[a][b] = 1;
				graph[b][a] = 1;
			}
			
			count = 0;
			recur(1,0);
			
			
			
			
			System.out.printf("#%d %d\n", tc, count);
		}
	}
	
	static void recur(int row, int edge) {
		if (edge == 2) {
			return;
		}
		
		for (int i = 2; i <= V; i++) {
			if (graph[row][i] == 1) {
				if (!visit[i]) {
					visit[i] = true;
					count++;
				}
				recur(i, edge+1);
			}
		}
		
		return;
	}
}
