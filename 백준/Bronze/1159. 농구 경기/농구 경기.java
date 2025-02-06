import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] players = new int[26];
        int N = Integer.parseInt(br.readLine());
        boolean isPossible = false;
        for (int i = 0; i < N; i++) {
            String name = br.readLine();
            char c =  name.charAt(0);
            players[c - 97]++;
            if (players[c - 97] == 5) isPossible = true;
        }

        if (isPossible) {
            for (int i = 0; i < 26; i++) {
                if (players[i] >= 5) System.out.print((char)(i + 97));
            }
        }
        else System.out.println("PREDAJA");
    }
}
