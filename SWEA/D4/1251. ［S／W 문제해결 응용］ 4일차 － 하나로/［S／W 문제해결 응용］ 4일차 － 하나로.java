import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Solution {
	
	static class Edge implements Comparable<Edge> {
		int from, to;
		double cost;
		
		public Edge(int from, int to, double cost) {
			this.from = from;
			this.to = to;
			this.cost = cost;
		}

		@Override
		public int compareTo(Solution.Edge o) {
			return Double.compare(this.cost, o.cost);
		}
	}
	
	
	static int p[];
	static int N, min;
	static double E;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			N = Integer.parseInt(br.readLine());
			
			int[] x = new int[N];
			int[] y = new int[N];
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				x[i] = Integer.parseInt(st.nextToken());
			}
			
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				y[i] = Integer.parseInt(st.nextToken());
			}
			
			E = Double.parseDouble(br.readLine());
			
			PriorityQueue<Edge> pq = new PriorityQueue<>();

			for (int i = 0; i < N-1; i++) {
				for (int j = i+1; j < N; j++) {
					long dx = x[i]-x[j];
					long dy = y[i]-y[j];
					double dist = Math.pow(dx, 2) + Math.pow(dy, 2);
					pq.add(new Edge(i,j,dist));
				}
			}
			
			p = new int[N];
			for (int i = 0; i < N; i++) {
				p[i] = i;
			}
			
			int cnt = 0;
			double sum = 0;
			while (!pq.isEmpty() && cnt < N-1) {
				Edge e = pq.poll();
				if (union(e.from,e.to)) {
					sum += e.cost;
					cnt++;
				}
			}
			
			long result = Math.round(sum*E);
			System.out.printf("#%d %d\n", tc, result);
		}
	}
	
	
	static boolean union(int x, int y) {
		x = find(x);
		y = find(y);
		
		if (x != y) {
			p[y] = x;
			return true;
		}
		
		return false;
	}
	
	static int find(int x) {
		if (p[x] == x) return x;
		return find(p[x]);
	}
}
