import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    static int[] dxPlus = { -1, 1, 0, 0 };
    static int[] dyPlus = { 0, 0, -1, 1 };
    static int[] dxX = { -1, -1, 1, 1 };
    static int[] dyX = { -1, 1, 1, -1 };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int[][] fly = new int[N][N];

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < N; j++) {
                    fly[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int max = Integer.MIN_VALUE;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    int totalPlus = fly[i][j];
                    int totalX = fly[i][j];
                    for (int k = 1; k <= M - 1; k++) {
                        for (int d = 0; d < 4; d++) {
                            int nr = i + (dxPlus[d] * k);
                            int nc = j + (dyPlus[d] * k);
                            int nrx = i + (dxX[d] * k);
                            int ncx = j + (dyX[d] * k);
                            if (nr >= 0 && nr < N && nc >= 0 && nc < N) {
                                totalPlus += fly[nr][nc];
                            }
                            if (nrx >= 0 && nrx < N && ncx >= 0 && ncx < N) {
                                totalX += fly[nrx][ncx];
                            }
                        }
                    }
                    max = Math.max(max, Math.max(totalPlus, totalX));
                }
            }

            System.out.printf("#%d %d\n", tc, max);
        }
    }
}