import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] chess = new String[8];

        for (int i = 0; i < 8; i++) {
          chess[i] = br.readLine();
        }

        int ans = 0;
        for (int i = 0; i < chess.length; i++) {
            if (i%2 == 0) {
                for (int j = 0; j < chess.length; j++) {
                    if (j % 2 == 0 && chess[i].charAt(j) == 'F') ans++;
                }
            }
            else {
                for (int j = 0; j < chess.length; j++) {
                    if (j % 2 != 0 && chess[i].charAt(j) == 'F') ans++;
                }
            }
        }
        System.out.println(ans);
    }
}