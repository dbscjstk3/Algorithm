import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int t = 0; t < 10; t++) {
            int tc = Integer.parseInt(br.readLine());
            int[][] ladders = new int[100][100];
            int x = 0, y= 0;
            for (int i = 0; i < 100; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 100; j++) {
                    ladders[i][j] = Integer.parseInt(st.nextToken());
                    if (ladders[i][j] == 2) {
                        x += i;
                        y += j;
                    }
                }
            }

            while (true) {
                if (x == 0) break;
                if (y > 0 && ladders[x][y-1] == 1) {
                    while (y > 0 && ladders[x][y-1] != 0) {
                        y--;
                    }
                }
                else if (y < 99 && ladders[x][y+1] == 1) {
                    while (y < 99 && ladders[x][y+1] != 0) {
                        y++;
                    }
                }
                x--;
            }
            System.out.printf("#%d %d\n", tc, y);
        }
    }
}