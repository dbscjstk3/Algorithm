import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = "";
        String EOF = "0 0 0";

        while (!(input = br.readLine()).equals(EOF)) {
            String[] triangle = input.split(" ");

            int a = Integer.parseInt(triangle[0]);
            int b = Integer.parseInt(triangle[1]);
            int c = Integer.parseInt(triangle[2]);

            int[] sides = {a,b,c};
            Arrays.sort(sides);

            if (Math.pow(sides[2], 2) == Math.pow(sides[0],2) + Math.pow(sides[1], 2)) {
                System.out.println("right");
            }
            else System.out.println("wrong");
        }
    }
}