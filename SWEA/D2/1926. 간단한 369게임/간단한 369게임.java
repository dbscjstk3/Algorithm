import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= N; i++) {
            String num = i + "";
            if (num.contains("3") || num.contains("6") || num.contains("9")) {
                for (int j = 0; j < num.length(); j++) {
                    if (num.charAt(j) == '3' || num.charAt(j) == '6' || num.charAt(j) == '9') sb.append("-");                }
            }
            else sb.append(num);
            sb.append(" ");
        }
        System.out.println(sb.toString());
    }
}