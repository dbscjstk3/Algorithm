import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int max = 0;
        int min = 0;
        int n = 1;
        while (true) {
            if (N % n == 0 && M % n == 0)
                max = n;
            if (n % N == 0 && n % M == 0) {
                min = n;
                break;
            }
            n++;
        }

        System.out.println(max);
        System.out.println(min);
    }
}