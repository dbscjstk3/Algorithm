import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] p;
	static int N, M;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		p = new int[N+1];
		
		for (int i = 0; i <= N; i++) {
			p[i] = i;
		}
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int op = Integer.parseInt(st.nextToken());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if (op == 0) 
				union(a,b);
			else {
				if (findSet(a) == findSet(b))
					System.out.println("YES");
				else
					System.out.println("NO");
			}
		}
	}
	
	static void union(int x, int y) {
		x = findSet(x);
		y = findSet(y);
		
		if (x != y)
			p[y] = x;
	}
	
	static int findSet(int x) {
		if (p[x] == x) return x;
		return findSet(p[x]);
	}
}
