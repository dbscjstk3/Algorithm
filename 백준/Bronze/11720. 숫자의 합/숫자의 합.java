import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String num = br.readLine();
        int total = 0;

        if (N == 1) System.out.println(num);
        else {
            for (int i = 0; i < num.length(); i++) {
                total += Character.getNumericValue(num.charAt(i));
            }
            System.out.println(total);
        }
    }
}
