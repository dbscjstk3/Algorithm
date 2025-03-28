import java.io.*;
import java.util.*;

public class Main {
	static int V, E, start, cnt;
	static int[][] graph;
	static boolean[] visit;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		V = Integer.parseInt(br.readLine());
		E = Integer.parseInt(br.readLine());
		
		graph = new int[V+1][V+1];
		visit = new boolean[V+1];
		
		for (int i = 0; i < E; i++) {
			st = new StringTokenizer(br.readLine());
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());
			
			graph[from][to] = graph[to][from] = 1;
		}
		
		cnt = 0;
		dfs(1);
		System.out.println(cnt);
	}
	
	static void dfs(int v) {
		visit[v] = true;
		
		for (int i = 1; i <= V; i++) {
			if (!visit[i] && graph[v][i] == 1) {
				visit[i] = true;
				cnt++;
				dfs(i);
			}
		}
	}
}
