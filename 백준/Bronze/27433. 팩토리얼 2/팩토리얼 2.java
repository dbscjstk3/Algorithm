import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        System.out.println(recur(N));
    }

    static Long recur(int N) {
        if (N == 0) return 1L;

        return Long.valueOf(recur(N-1) * N);
    }
}