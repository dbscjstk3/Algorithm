import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int S1 = Integer.parseInt(st.nextToken());
        int S2 = Integer.parseInt(st.nextToken());
        int S3 = Integer.parseInt(st.nextToken());

        int total = S1+S2+S3;
        int[] totals = new int[total+1];

        for (int i = 1; i <= S1; i++) {
            for (int j = 1; j <= S2; j++) {
                for (int k = 1; k <= S3; k++) {
                    int idx = i+j+k;
                    totals[idx]++;
                }
            }
        }

        int max = -1;
        for (int i = 0; i < totals.length; i++) {
            if (totals[i] > max) max = totals[i];
        }

        for (int i = 0; i < totals.length; i++) {
            if (totals[i] == max) {
                System.out.println(i);
                break;
            }
        }
    }
}
