import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] strArr = new String[3];
        for (int i = 0; i < 3; i++) {
            strArr[i] = br.readLine();
        }

        String[] colors = {"black","brown","red","orange","yellow","green","blue","violet","grey","white"};
        int firstValue = 0, secondValue = 0, multiplier = 1;
        for (int i = 0; i < colors.length; i++) {
            if (strArr[0].equals(colors[i])) firstValue = i;
            if (strArr[1].equals(colors[i])) secondValue = i;
            if (strArr[2].equals(colors[i])) multiplier = (int) Math.pow(10, i);
        }

        long resistance = (firstValue * 10L + secondValue) * multiplier;
        System.out.println(resistance);
    }
}