import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < N; j++) {
                    puzzle[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int rCount = countSpace(puzzle, N, K, true);
            int cCount = countSpace(puzzle, N, K, false);
            System.out.printf("#%d %d\n", tc, rCount+cCount);
        }
    }

    static int countSpace(int[][] puzzle, int N, int K, boolean isRow) {
        int count = 0;
        for (int i = 0; i < N; i++) {
            int len = 0;
            for (int j = 0; j < N; j++) {
                int current = isRow ? puzzle[i][j] : puzzle[j][i];
                if (current == 1) len++;
                else {
                    if (len == K) {
                        count++;
                    }
                    len = 0;
                }
            }

            if (len == K) count++;
        }
        return count;
    }
}