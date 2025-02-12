import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
        for (int T = 1; T <= 10; T++) {
            int tc = Integer.parseInt(br.readLine());
            char[][] grid = new char[100][100];
 
            for (int i = 0; i < 100; i++) {
                String str = br.readLine();
                grid[i] = str.toCharArray();
            }
 
            int max = Integer.MIN_VALUE;
            //열 회문 탐색
            for (int len = 2; len <= 100; len++) {
                for (int i = 0; i < 100; i++) {
                    for (int j = 0; j <= 100 - len; j++) {
                        if(isPalindrome(grid, i, j, len, true)) {
                            max = Math.max(max, len);
                        }
                    }
                }
            }
 
            //행 회문 탐색
            for (int len = 2; len <= 100; len++) {
                for (int i = 0; i <= 100 - len; i++) {
                    for (int j = 0; j < 100; j++) {
                        if(isPalindrome(grid, i, j, len, false)) {
                            max = Math.max(max,len);
                        }
                    }
                }
            }
 
            System.out.printf("#%d %d\n", tc, max);
        }
    }
 
    private static boolean isPalindrome(char[][] grid, int x, int y, int len, boolean isRow) {
        for (int k = 0; k < len/2; k++) {
            char start = isRow ? grid[x][y+k] : grid[x+k][y];
            char end = isRow ? grid[x][y+len-1-k] : grid[x+len-1-k][y];
 
            if (start != end) return false;
        }
        return true;
    }
}