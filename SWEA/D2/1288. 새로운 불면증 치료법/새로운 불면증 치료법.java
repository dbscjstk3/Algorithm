import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            int N = Integer.parseInt(br.readLine());

            boolean[] seen = new boolean[10];
            int num = 0; int cnt = 0;
            while (cnt < 10) {
                num += N;

                String strCnt = Integer.toString(num);
                for (int i = 0; i < strCnt.length(); i++) {
                    int digit = Character.getNumericValue(strCnt.charAt(i));
                    if (seen[digit]) continue;
                    else {
                        seen[digit] = true;
                        cnt++;
                    }
                }
            }
            System.out.printf("#%d %d\n", tc, num);
        }
    }
}