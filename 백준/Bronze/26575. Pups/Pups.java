import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        for (int tc = 0; tc < N; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            double d = Double.parseDouble(st.nextToken());
            double f = Double.parseDouble(st.nextToken());
            double p = Double.parseDouble(st.nextToken());

            System.out.printf("$%.2f\n", d * f * p);
        }

    }
}