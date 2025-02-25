import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int[] count = new int[10];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        int ABC = A*B*C;
        String abc = ABC + "";
        for (int i = 0; i < abc.length(); i++) {
            count[Character.getNumericValue(abc.charAt(i))]++;
        }

        for (int i = 0; i < count.length; i++) {
            System.out.println(count[i]);
        }
    }
}