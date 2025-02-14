import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            int N = Integer.parseInt(br.readLine());
            int[][] balloons = new int[N][N];
            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < N; j++) {
                    balloons[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    int rowSum = 0, colSum = 0;
                    for (int k = 0; k < N; k++) {
                        rowSum += balloons[i][k];
                        colSum += balloons[k][j];
                    }
                    int total = rowSum + colSum - balloons[i][j];
                    max = Math.max(max, total);
                    min = Math.min(min, total);
                }
            }
            System.out.printf("#%d %d\n", tc, max-min);
        }
    }
}