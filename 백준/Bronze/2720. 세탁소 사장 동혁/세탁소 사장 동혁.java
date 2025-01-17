import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        int[] cent = {25,10,5,1};
        for (int t = 0; t < T; t++) {
            int C = Integer.parseInt(br.readLine());
            String ans = "";
            for (int i = 0; i < 4; i++) {
                ans += C/cent[i];
                C%=cent[i];
                ans += " ";
            }
            System.out.println(ans);
        }
    }
}