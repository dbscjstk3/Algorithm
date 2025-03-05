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

    static int recur(int N) {
        if (N == 0) return 0;

        if (N == 1) return 1;

        return recur(N-2) + recur(N-1);
    }
}
