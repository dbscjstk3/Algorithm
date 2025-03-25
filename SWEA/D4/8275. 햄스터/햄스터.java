import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
	static int N,X,M;
	static int[] cage, ans;
	static int[][] memo;
	static int max;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			X = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			
			cage = new int[N];
			ans = new int[N];
			memo = new int[M][3];
			
			max = -1;
			
			for (int i = 0; i < M; i++) {
				st = new StringTokenizer(br.readLine());
				memo[i][0] = Integer.parseInt(st.nextToken())-1;
				memo[i][1] = Integer.parseInt(st.nextToken())-1;
				memo[i][2] = Integer.parseInt(st.nextToken());
			}
			
			dfs(0);
			
			System.out.print("#" + tc + " ");
			if (max == -1) System.out.println(-1);
			else {
				for (int num : ans) {
					System.out.print(num + " ");
				}
				System.out.println();
			}
		}
	}
	
	static void dfs(int depth) {
		if (depth == N) {
			for (int i = 0; i < M; i++) {
				int prefixSum = 0;
				for (int j = memo[i][0]; j <= memo[i][1]; j++) {
					prefixSum += cage[j];
				}
				
				if (prefixSum != memo[i][2]) return;
			}
			
			int sum = 0;
			for (int i = 0; i < N; i++) {
				sum += cage[i];
			}
			
			if (sum > max) {
				max = sum;
				ans = Arrays.copyOf(cage, N);
			}
			
			return;
		}
		
		
		for (int i = 0; i <= X; i++) {
			cage[depth] = i;
			dfs(depth+1);
		}
	}
	
}
