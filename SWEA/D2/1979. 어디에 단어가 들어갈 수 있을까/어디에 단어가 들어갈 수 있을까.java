import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			int[][] puzzle = new int[N][N];

			//배열 입력력
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < N; j++) {
					puzzle[i][j] = Integer.parseInt(st.nextToken());
				}
			}

			int ans = 0;
			for (int i = 0; i < N; i++) {
				int countRow = 0;
				int countCol = 0;
				for (int j = 0; j < N; j++) {
					//가로 탐색
					if (puzzle[i][j] == 1) countRow++;
					else {
						if (countRow == K) ans++;
						countRow = 0;
					}
					
					//세로 탐색
					if (puzzle[j][i] == 1) countCol++;
					else {
						if (countCol == K) ans++;
						countCol = 0;
					}
				}

				if (countRow == K) ans++;
				if (countCol == K) ans++;
			}
			System.out.printf("#%d %d\n", tc, ans);
		}
	}
}