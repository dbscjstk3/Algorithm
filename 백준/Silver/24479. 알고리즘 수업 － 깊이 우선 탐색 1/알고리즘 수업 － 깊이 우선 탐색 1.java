import java.io.*;
import java.util.*;

public class Main {
	static int V, E, start, cnt;
	static List<Integer>[] graph;
	static int[] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		V = Integer.parseInt(st.nextToken());
		E = Integer.parseInt(st.nextToken());
		start = Integer.parseInt(st.nextToken());

		graph = new ArrayList[V + 1];
		visited = new int[V + 1];

		for (int i = 1; i <= V; i++) {
			graph[i] = new ArrayList<>();
		}

		for (int i = 0; i < E; i++) {
			st = new StringTokenizer(br.readLine());
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());

			graph[from].add(to);
			graph[to].add(from); // 무방향 그래프
		}

		for (int i = 1; i <= V; i++) {
			Collections.sort(graph[i]);
		}

		cnt = 1;
		dfs(start);
		
		for (int i = 1; i < visited.length; i++) {
			sb.append(visited[i]+"\n");
		}
		
		System.out.println(sb);
	
	}

	static void dfs(int v) {
		visited[v] = cnt;

		for (int i = 0; i < graph[v].size(); i++) {
			int node = graph[v].get(i);
			if (visited[node] == 0) {
				cnt++;
				dfs(node);
			}
		}
	}
}
