import java.io.*;
import java.util.*;

public class Main {
	static class Node {
		int idx, dist;

		public Node(int idx, int dist) {
			this.idx = idx;
			this.dist = dist;
		}
	}

	static int N, M, max;
	static List<List<Integer>> graph;
	static boolean[] visited;
	static List<Node> ans = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		graph = new ArrayList<>();
		for (int i = 0; i < N + 1; i++) {
			graph.add(new ArrayList<>());
		}

		visited = new boolean[N + 1];
		max = Integer.MIN_VALUE;

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());

			graph.get(A).add(B);
			graph.get(B).add(A);
		}

		bfs(1);

		Collections.sort(ans, new Comparator<Node>() {

			@Override
			public int compare(Main.Node o1, Main.Node o2) {
				if (o1.dist == o2.dist)
					return o1.idx - o2.idx;
				return o1.dist - o2.dist;
			}

		});

		int count = 0;
		Node minNode = new Node(9999, 0);
		for (Node node : ans) {
			if (node.dist == max) {
				count++;
				if (node.idx < minNode.idx) {
					minNode = new Node(node.idx, node.dist);
				}
			}
		}

		sb.append(minNode.idx + " " + minNode.dist + " " + count);
		System.out.println(sb);

	}

	static void bfs(int start) {
		Queue<Node> q = new LinkedList<>();
		q.add(new Node(1, 0));
		visited[1] = true;

		while (!q.isEmpty()) {
			Node curr = q.poll();
			max = Math.max(curr.dist, max);

			for (int next : graph.get(curr.idx)) {
				if (!visited[next]) {
					visited[next] = true;
					q.add(new Node(next, curr.dist + 1));
					ans.add(new Node(next, curr.dist + 1));
				}
			}
		}
	}
}
