import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        while (N > 0) {
            int temp = N % B;
            if (temp >= 10) sb.append((char)(temp - 10 + 'A'));
            else sb.append(temp);
            N /= B;
        }
        System.out.println(sb.reverse().toString());
    }
}