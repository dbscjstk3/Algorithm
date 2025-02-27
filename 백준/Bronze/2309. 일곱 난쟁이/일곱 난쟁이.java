import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] dwarfs = new int[9];
        int total = 0;
        for (int i = 0; i < 9; i++) {
            dwarfs[i] = Integer.parseInt(br.readLine());
            total += dwarfs[i];
        }

        Arrays.sort(dwarfs);
        
        int a = 0, b = 0;
        for (int i = 0; i <= 7; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (total - dwarfs[i] - dwarfs[j] == 100) {
                    a = dwarfs[i];
                    b = dwarfs[j];
                    break;
                }
            }
        }
        
        for (int dwarf : dwarfs) {
            if (dwarf != a && dwarf != b) {
                System.out.println(dwarf);
            }
        }

    }
}