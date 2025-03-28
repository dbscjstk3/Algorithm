import java.io.*;
import java.util.*;

public class Main {
	static int V, E, start, cnt;
	static List<Integer>[] graph;
	static int[] check;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		V = Integer.parseInt(st.nextToken());
		E = Integer.parseInt(st.nextToken());
		start = Integer.parseInt(st.nextToken());
		
		graph = new ArrayList[V+1];
		check = new int[V+1];
		
		for (int i = 1; i <= V; i++) {
			graph[i] = new ArrayList<>();
		}
		
		for (int i = 0; i < E; i++) {
			st = new StringTokenizer(br.readLine());
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());
			
			graph[from].add(to);
			graph[to].add(from);
		}
		
		for (int i = 1; i <= V; i++) {
			Collections.sort(graph[i]);
		}
		
		cnt = 1;
		bfs(start);
		
		for (int i = 1; i < check.length; i++) {
			sb.append(check[i]+"\n");
		}
		
		System.out.println(sb);
	}
	
	static void bfs(int v) {
		Queue<Integer> q = new LinkedList<>();
		q.add(v);
		check[v] = cnt++;
		
		while (!q.isEmpty()) {
			int curr = q.poll();
			
			for (int next : graph[curr]) {
				if (check[next] == 0) {
					check[next] = cnt++;
					q.add(next);
				}
			}
		}
		
	}
}
