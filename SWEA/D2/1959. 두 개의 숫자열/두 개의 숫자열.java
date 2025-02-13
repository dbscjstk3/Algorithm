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
            int M = Integer.parseInt(st.nextToken());
            int[] Ai = new int[N];
            int[] Bj = new int[M];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < Ai.length; i++) {
                Ai[i] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < Bj.length; i++) {
                Bj[i] = Integer.parseInt(st.nextToken());
            }

            int max = Integer.MIN_VALUE;
            if (N > M) {
                for (int i = 0; i <= N-M; i++) {
                    int total = 0;
                    for (int j = 0; j < M; j++) {
                        total += Bj[j] * Ai[i+j];
                    }
                    max = Math.max(max, total);
                }
            }
            else {
                for (int i = 0; i <= M-N; i++) {
                    int total = 0;
                    for (int j = 0; j < N; j++) {
                        total += Ai[j] * Bj[i+j];
                    }
                    max = Math.max(max, total);
                }
            }

            System.out.printf("#%d %d\n", tc, max);
        }
    }
}