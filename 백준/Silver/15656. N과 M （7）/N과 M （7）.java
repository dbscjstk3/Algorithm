import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int N, M;
	static StringTokenizer st;
	static StringBuilder sb;
	static int[] nums, ans;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		nums = new int[N];
		ans = new int[M];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(nums);
		sb = new StringBuilder();
		perm(0);
		System.out.println(sb);
	}

	static void perm(int depth) {
		if (depth == M) {
			for (int num : ans) {
				sb.append(num + " ");
			}
			sb.append("\n");

			return;
		}

		for (int i = 0; i < N; i++) {
			ans[depth] = nums[i];
			perm(depth + 1);
		}
	}
}
