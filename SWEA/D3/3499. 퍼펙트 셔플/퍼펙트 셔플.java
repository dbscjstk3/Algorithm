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
            String[] deck = new String[N];
            StringTokenizer st = new StringTokenizer(br.readLine());
            int idx = 0;
            for (int i = 0; i < N; i++) {
                deck[idx] = st.nextToken();
                idx += 2;

                if (idx >= N) idx = 1;
            }

            System.out.print("#" + tc + " ");
            for (String str : deck) {
                System.out.print(str + " ");
            }
            System.out.println();
        }
    }
}