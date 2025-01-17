import java.io.*;
import java.util.*;

public class Main {
    public static int ConvertBasetoDecimal(String num, int base) {
        int sum = 0;
        int power = 1;

        for (int i = num.length() - 1; i >= 0; i--) {
            char now = num.charAt(i);
            
            if (now >= '0' && now <= '9') sum += (now - '0') * power;
            else  sum += (now - 'A' + 10) * power;
            power *= base;
        }
        return sum;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());

        System.out.println(ConvertBasetoDecimal(N, B));
    }
}