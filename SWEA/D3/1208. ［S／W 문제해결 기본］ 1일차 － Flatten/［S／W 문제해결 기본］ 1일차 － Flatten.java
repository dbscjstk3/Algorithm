import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int tc = 1; tc <= 10; tc++) {
            int dump = Integer.parseInt(br.readLine());
            int[] box = new int[100];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 100; i++) {
                box[i] = Integer.parseInt(st.nextToken());
            }

            for (int i = 0; i < dump; i++) {
                Arrays.sort(box);
                box[99]--;
                box[0]++;
            }
            Arrays.sort(box);
            System.out.printf("#%d %d\n", tc, box[99]-box[0]);
        }
    }
}
