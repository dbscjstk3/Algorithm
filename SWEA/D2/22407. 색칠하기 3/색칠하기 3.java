import java.util.Scanner;

public class Solution {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            int[][] grid = new int[10][10];

            int rr1 = sc.nextInt();
            int rc1 = sc.nextInt();
            int rr2 = sc.nextInt();
            int rc2 = sc.nextInt();

            for (int i = rr1; i <= rr2; i++) {
                for (int j = rc1; j <= rc2; j++) {
                    grid[i][j] += 1;
                }
            }

            int br1 = sc.nextInt();
            int bc1 = sc.nextInt();
            int br2 = sc.nextInt();
            int bc2 = sc.nextInt();

           for (int i = br1; i <= br2; i++) {
                for (int j = bc1; j <= bc2; j++) {
                    grid[i][j] += 1;
                }
            }

            int startX = -1, startY = -1;
            int w = 0, h = 0;
            outer : for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (grid[i][j] == 2) {
                        startX = i;
                        startY = j;
                        break outer;
                    }
                }
            }

            if (startX != -1) {
                int x = startX;
                while (x < 10 && grid[x][startY] == 2) {
                    h++;
                    x++;
                }

                int y = startY;
                while (y < 10 && grid[startX][y] == 2) {
                    w++;
                    y++;
                }
            }
            

            System.out.printf("#%d %d %d\n", tc, w, h);
        }

        sc.close();
    }
}
