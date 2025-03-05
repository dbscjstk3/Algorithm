import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        dp = new int[N+1];

        System.out.println(recur(N));
    }

    static int recur(int N) {
        if (N <= 1) return N;

        if (dp[N] != 0) return dp[N];

        dp[N] = recur(N-2) + recur(N-1);
        return dp[N];
    }


}