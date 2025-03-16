import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Solution {
    static int[][] hambugi;
    static int N, L, max;
    static int score, cal;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            L = Integer.parseInt(st.nextToken());
            hambugi = new int[N][2];

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                score = Integer.parseInt(st.nextToken());
                cal = Integer.parseInt(st.nextToken());
                hambugi[i][0] = score;
                hambugi[i][1] = cal;
            }

            max = Integer.MIN_VALUE;
            powerSet(0, 0, 0);

            System.out.printf("#%d %d\n", tc, max);
        }

    }

    static void powerSet(int depth, int score, int cal) {
        if (depth == N) {
            if (cal <= L) {
                max = Math.max(max, score);
            }

            return;
        }

        powerSet(depth+1, score, cal);
        score += hambugi[depth][0];
        cal += hambugi[depth][1];
        powerSet(depth+1, score, cal);
    }
}
