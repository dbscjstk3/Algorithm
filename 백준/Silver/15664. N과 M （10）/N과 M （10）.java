import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int N, M;
	static StringBuilder sb;
	static int[] nums, ans;
	static boolean[] visit;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		sb = new StringBuilder();
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		nums = new int[N];
		ans = new int[M];
		visit = new boolean[N];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(nums);
		perm(0,0);
		System.out.println(sb);
		
	}
	
	static void perm(int depth, int idx) {
		if (depth == M) {
			for (int num : ans) {
				sb.append(num + " ");
			}
			sb.append("\n");
			
			return;
		}
		
		int before = 0;
		for (int i = idx; i < N; i++) {
			if (!visit[i]) {
				if (before != nums[i]) {
					visit[i] = true;
					ans[depth] = nums[i];
					before = nums[i];
					perm(depth+1, i+1);
					visit[i] = false;
				}
			}
		}
	}
}
