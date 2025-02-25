import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int col;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int num = 1;
        int cnt = 0;
        while (true) {
            String str = Integer.toString(num);

            if (str.contains("666")) {
                cnt++;
                if (cnt == N)
                    break;
            }

            num++;
        }

        System.out.println(num);
    }
}