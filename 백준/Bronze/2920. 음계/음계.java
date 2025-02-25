import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[] count = new int[10];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        String ans = "";
        boolean isAscending = true;
        boolean isMixed = false;

        for (int i = 1; i < input.length; i++) {
            if (Integer.parseInt(input[i-1]) - Integer.parseInt(input[i]) == 1) isAscending = false;
            else isMixed = true;
        }

        if (isAscending) System.out.print("ascending");
        else if (isMixed) System.out.print("mixed");
        else System.out.print("descending");
    }
}