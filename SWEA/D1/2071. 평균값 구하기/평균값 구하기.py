import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            int[] nums = new int[10];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < nums.length; i++) {
                nums[i] = Integer.parseInt(st.nextToken());
            }

            int total = 0;
            for (int i = 0; i < nums.length; i++) {
                total += nums[i];
            }

            System.out.printf("#%d %d\n", tc, Math.round((double)total/nums.length));
        }
    }
}