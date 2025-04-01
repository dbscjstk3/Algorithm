import java.io.*;
import java.util.*;

public class Main {
	static final int INF = Integer.MAX_VALUE;
	static int[] dc = {-1,1};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		int[] button = new int[N+1];
		
		String[] str = br.readLine().split(" ");
	
		for (int i = 0; i < N; i++) {
			button[i+1] = Integer.parseInt(str[i]);
		}
		
		int M = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < M; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int sex = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());
			
			if (sex == 1) {
				for (int n = num; n <= N; n+=num) {
					button[n] = Math.abs(button[n]-1);
				}
			}
			else {
				int idx = 1;
				button[num] = Math.abs(button[num]-1);
				while (true) {
					int left = num + dc[0] * idx;
					int right = num + dc[1] * idx;
					
					if (left < 1 || right > N) break;
					
					if (button[left] != button[right]) break;
					
					button[left] = button[right] = Math.abs(button[left]-1);
					
					idx++;
				}
			}
		}
		
		for (int i = 1; i < button.length; i++) {
			System.out.print(button[i] + " ");
			if (i % 20 == 0) {
				System.out.println();
			}
		}
	}
}
