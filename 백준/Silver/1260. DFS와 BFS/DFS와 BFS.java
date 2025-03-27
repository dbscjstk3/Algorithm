import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int V, E;
	static int[][] tree;
	static boolean[] visited;
	static Queue<Integer> q;
	static StringBuilder sb;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		sb = new StringBuilder();
		
		V = Integer.parseInt(st.nextToken());
		E = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		
		q = new LinkedList<>();
		tree = new int[V+1][V+1];
		visited = new boolean[V+1];
		
		for (int i = 0; i < E; i++) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			tree[A][B] = 1;
			tree[B][A] = 1;
		}
		
		dfs(v);
		sb.append("\n");
		visited = new boolean[V+1];
		bfs(v);
		
		System.out.println(sb);
	}
	
	static void dfs(int v) {
		visited[v] = true;
		sb.append(v+" ");
		
		for (int i = 1; i <= V; i++) {
			if (!visited[i] && tree[v][i] == 1)
				dfs(i);
		}
	}
	
	static void bfs(int v) {
		q.add(v);
		visited[v] = true;
		
		while (!q.isEmpty()) {
			v = q.poll();
			sb.append(v + " ");
			
			for (int i = 1; i <= V; i++) {
				if (tree[v][i] == 1 && !visited[i]) {
					q.add(i);
					visited[i] = true;
				}
			}
		}
	}
}
