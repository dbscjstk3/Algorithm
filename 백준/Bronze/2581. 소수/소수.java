import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        
        int total = 0;
        int min = 9999;
        for (int i = M; i <= N; i++) {
            if (i == 1) continue;
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime == true) {
                total += i;
                if (min > i) min = i;
            }
        }
        if (total == 0) System.out.println(-1);
        else {
            System.out.println(total);
            System.out.println(min);
        }
    }
}