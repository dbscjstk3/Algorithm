import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
	static char[][] grid = new char[8][8];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb;
		StringBuilder sb2;

		for (int tc = 1; tc <= 10; tc++) {
			int K = Integer.parseInt(br.readLine());
			for (int i = 0; i < 8; i++) {
				grid[i] = br.readLine().toCharArray();
			}


			int cnt = 0;
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j <= 8-K; j++) {
					sb = new StringBuilder();
					sb2 = new StringBuilder();
					for (int k = 0; k < K; k++) {
						sb.append(grid[i][j+k]);
					}

					for (int k = 0; k < K; k++) {
						sb2.append(grid[j+k][i]);
					}

					if (sb.toString().equals(sb.reverse().toString())) cnt++;
					if (sb2.toString().equals(sb2.reverse().toString())) cnt++;

				}
			}

			System.out.printf("#%d %d\n", tc, cnt);
		}
	}
}