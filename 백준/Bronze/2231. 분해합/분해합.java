import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int num = 1;
        boolean isConstructor = false;
        while (num < N) {
            String n = num + "";
            int[] nums = new int[n.length()];
            int total = 0;

            for (int i = 0; i < n.length(); i++) {
                nums[i] = Character.getNumericValue(n.charAt(i));
                total += nums[i];
            }

            int M = total + num;
            if (M == N) {
                isConstructor = true;
                break;
            }

            num++;
        }
        if (isConstructor) System.out.println(num);
        else System.out.println(0);
    }
}

