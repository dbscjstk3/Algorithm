import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int F = Integer.parseInt(br.readLine());

        int start = (N/100)*100;
        int num = 0;
        for (int i = start; i <= start+99; i++) {
            if (i % F == 0) {
                num += i;
                break;
            }
        }
        String str = Integer.toString(num);
        String[] strArray = str.split("");

        for (int i = strArray.length - 2; i < strArray.length; i++) {
            System.out.print(strArray[i]);
        }
    }
}
