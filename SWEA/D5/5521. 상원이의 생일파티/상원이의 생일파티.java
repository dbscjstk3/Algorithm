import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Solution {
	static int[][] graph;
	static int V, E;
	static StringTokenizer st;
	static List<Integer> ans;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine());
			V = Integer.parseInt(st.nextToken());
			E = Integer.parseInt(st.nextToken());
			graph = new int[V+1][V+1];
			
			for (int i = 0; i < E; i++) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				
				graph[a][b] = 1;
				graph[b][a] = 1;
			}
			
			ans = new ArrayList<>();
			for (int i = 1; i <= V; i++) {
				if (graph[1][i] == 1) {
					if (!ans.contains(i)) ans.add(i);
					for (int j = 2; j <= V; j++) {
						if (graph[i][j] == 1 && !ans.contains(j)) {
							ans.add(j);
						}
					}
				}
			}
			
			System.out.printf("#%d %d\n", tc, ans.size());
		}
	}
}
