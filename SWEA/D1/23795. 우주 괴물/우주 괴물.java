import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    static int[] dx = { -1, 1, 0, 0 };
    static int[] dy = { 0, 0, -1, 1 };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            int N = Integer.parseInt(br.readLine());
            int[][] grid = new int[N][N];

            int row = 0, col = 0;
            int count = 0;
            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < N; j++) {
                    grid[i][j] = Integer.parseInt(st.nextToken());
                    if (grid[i][j] == 2) {
                        row = i;
                        col = j;
                    }
                    else if (grid[i][j] == 0) count++;
                }
            }

            for (int d = 0; d < 4; d++) {
                int nr = row + dx[d];
                int nc = col + dy[d];

                while (true) {
                    if (nr < 0 || nr >= N || nc < 0 || nc >= N || grid[nr][nc] == 1) {
                        break;
                    }

                    count--;
                    nr = nr + dx[d];
                    nc = nc + dy[d];
                }
            }

            System.out.printf("#%d %d\n", tc, count);
        }
    }
}