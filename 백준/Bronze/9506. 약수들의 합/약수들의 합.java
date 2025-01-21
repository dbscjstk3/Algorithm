import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int n = Integer.parseInt(br.readLine());

            if (n == -1) return;
            int sum = 0;
            int max = 0;
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    if (i > max) max = i;
                    sum += i;
                }
            }

            if (sum == n) {
                System.out.printf("%d =", n);
                for (int i = 1; i < n; i++) {
                    if (n % i == 0) {
                        System.out.printf(" %d ", i);
                        if (i != max) System.out.print("+");
                    }
                }
                System.out.println();
            }
            else System.out.printf("%d is NOT perfect.\n", n);
        }
    }
}