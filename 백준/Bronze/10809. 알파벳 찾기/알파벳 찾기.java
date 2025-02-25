import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[] alphabet = new int[26];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] charArr = br.readLine().toCharArray();

        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = -1;
        }

        for (int i = 0; i < charArr.length; i++) {
            if (alphabet[charArr[i] - 'a'] != -1) continue;
            else alphabet[charArr[i] - 'a'] = i;
        }

        for (int num : alphabet) {
            System.out.print(num + " ");
        }
    }
}