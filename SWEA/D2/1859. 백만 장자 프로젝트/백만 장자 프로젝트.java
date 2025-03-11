import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    static int[] price;
        public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            int N = Integer.parseInt(br.readLine());

            price = new int[N];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                price[i] = Integer.parseInt(st.nextToken());
            }

            int max = Integer.MIN_VALUE;
            long ans = 0;
            for (int i = N-1; i >= 0; i--) {
                if (price[i] > max) max = price[i];
                else {
                    ans += (max - price[i]);
                }
            }

            System.out.printf("#%d %d\n", tc, ans);
        }
    }
}