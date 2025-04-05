import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.List;

class Main {
    static int N;
    static int[] dp;
    static int time1;
    static int time2;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        dp = new int[110000000];

        fibo1(N);
        fibo2(N);

        System.out.println(time1);
        System.out.println(time2);
    }

    static int fibo1(int n) {
        if (n <= 2) {
            time1++;
            return 1;
        }

        return fibo1(n-1) + fibo1(n-2);
    }

    static int fibo2(int n) {
        dp[1] = dp[2] = 1;

        for (int i = 3; i <= n; i++) {
            time2++;
            dp[n] = dp[n-1] + dp[n-2];
        }
        
        return dp[n];
    }
}