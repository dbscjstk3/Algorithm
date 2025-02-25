import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int ans = factorial(A) / (factorial(A - B) * factorial(B));
        System.out.println(ans);
    }

    public static int factorial(int a) {
        if (a == 0)
            return 1;
        return factorial(a - 1) * a;
    }
}