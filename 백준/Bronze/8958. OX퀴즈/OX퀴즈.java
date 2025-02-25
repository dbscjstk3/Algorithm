import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[] count = new int[10];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for (int tc = 0; tc < T; tc++) {
            String S = br.readLine();
            int N = S.length();

            int cnt = 0;
            int score = 0;
            for (int i = 0; i < N; i++) {
                if (S.charAt(i) == 'O') {
                    cnt++;
                    score += cnt;
                } else
                    cnt = 0;
            }

            System.out.println(score);
        }
    }
}