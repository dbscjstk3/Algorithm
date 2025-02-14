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
            int N = Integer.parseInt(br.readLine());
            int[] start = new int[N];
            int[] end = new int[N];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                start[i] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                end[i] = Integer.parseInt(st.nextToken());
            }

            int cnt = 0;
            while (true) {
                if (Arrays.equals(start, end)) break;
                for (int idx = 0; idx < N; idx++) {
                    if (start[idx] != end[idx]) {
                        for (int i = idx; i < N; i++) {
                            start[i] = 1 - start[i];
                        }
                        cnt++;
                    }
                }
            }

            System.out.printf("#%d %d\n", tc, cnt);
        }
    }
}