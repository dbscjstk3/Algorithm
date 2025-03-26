import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class Solution {
    static int N, maxNum, ans;
    static int[][] cafe;
    static boolean[][] visited;
    static boolean[] dessert;
    static int[] dr = { 1, 1, -1, -1 }; // 우하 좌하 좌상 우상
    static int[] dc = { 1, -1, -1, 1 };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            N = Integer.parseInt(br.readLine());
            cafe = new int[N][N];

            maxNum = -1;
            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < N; j++) {
                    cafe[i][j] = Integer.parseInt(st.nextToken());
                    maxNum = Math.max(maxNum, cafe[i][j]);
                }
            }

            ans = -1;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    dessert = new boolean[maxNum + 1];
                    visited = new boolean[N][N];
                    dessert[cafe[i][j]] = true;
                    visited[i][j] = true;
                    dfs(i, j, i, j, 0, 1);
                }
            }

            System.out.printf("#%d %d\n", tc, ans);
        }
    }

    static void dfs(int row, int col, int startRow, int startCol, int dir, int count) {
        for (int d = dir; d <= dir + 1; d++) {
            if (d == 4)
                break;
            int nr = row + dr[d];
            int nc = col + dc[d];

            if (nr < 0 || nr >= N || nc < 0 || nc >= N)
                continue;

            if (nr == startRow && nc == startCol) {
                if (ans < count)
                    ans = count;
                return;
            }

            if (dessert[cafe[nr][nc]])
                continue;
            if (visited[nr][nc])
                continue;

            visited[nr][nc] = true;
            dessert[cafe[nr][nc]] = true;
            dfs(nr, nc, startRow, startCol, d, count + 1);
            visited[nr][nc] = false;
            dessert[cafe[nr][nc]] = false;
        }
    }

}
