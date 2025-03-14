
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	static int[] nums;
	static int N, M, max;
	static int total;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		nums = new int[N];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		
		total = 0;
		max = Integer.MIN_VALUE;
		comb(0, 0, 0);
		System.out.println(max);
	}

	static void comb(int depth, int start, int total) {
		if (depth == 3) {
			if (total > M) return;
			
			max = Math.max(max, total);
			
			return;
		}
		
		
		
		for (int i = start; i < N; i++) {
			comb(depth+1, i+1, total+nums[i]);
		}
	}
}