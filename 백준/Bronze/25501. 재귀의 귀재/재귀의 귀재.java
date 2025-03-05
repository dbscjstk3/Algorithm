import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int rCount;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for (int tc = 0; tc < T; tc++) {
            String str = br.readLine();

            rCount = 0;
            System.out.printf("%d %d\n", isPalindrome(str), rCount);
        }

    }

    static int isPalindrome(String str) {
        return recur(str, 0, str.length() - 1);
    }

    static int recur(String str, int l, int r) {
        rCount++;
        
        if (l >= r)
            return 1;
        else if (str.charAt(l) != str.charAt(r))
            return 0;
        else return recur(str, l+1, r-1);
    }
}