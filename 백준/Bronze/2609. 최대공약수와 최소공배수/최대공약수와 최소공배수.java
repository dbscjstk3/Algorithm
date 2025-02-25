import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        System.out.println(GCD(N,M));
        System.out.println(LCM(N,M));

    }
    
    //최대공약수 : Greatest Common Divisor
    public static int GCD(int a, int b) {
        if (b == 0) return a;
        return GCD(b, a%b);
    }

    //최소공배수 : Least Common Multiple
    public static int LCM(int a, int b) {
        int gcd = GCD(a, b);
        return (a*b)/gcd;
    }
}