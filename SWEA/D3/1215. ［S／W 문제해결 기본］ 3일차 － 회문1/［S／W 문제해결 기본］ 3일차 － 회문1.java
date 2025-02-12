import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        for (int T = 1; T <= 10; T++) {
            int len = Integer.parseInt(br.readLine());

            char[][] grid = new char[8][8];
            for (int i = 0; i < 8; i++) {
                String str = br.readLine();
                for (int j = 0; j < 8; j++) {
                    grid[i][j] = str.charAt(j);
                }
            }

            int N = grid.length;
            int cnt = 0;
            //가로(행) 기준 회문 탐색
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N-len+1; j++) {
                    boolean flag = true;
                    for (int k = 0; k < len/2; k++) {
                        if (grid[i][j+k] != grid[i][j-k+len-1]) {
                            flag = false;
                            break;
                        }
                    }
                    if (flag) cnt++;
                }
            }

            //세로(열) 기준 회문 탐색
            for (int i = 0; i < N-len+1; i++) {
                for (int j = 0; j < N; j++) {
                    boolean flag = true;
                    for (int k = 0; k < len/2; k++) {
                        if (grid[i+k][j] != grid[i-k+len-1][j]) {
                            flag = false;
                            break;
                        }
                    }
                    if (flag) cnt++;
                }
            }

            System.out.printf("#%d %d\n", T, cnt);
            
        }
    }
}