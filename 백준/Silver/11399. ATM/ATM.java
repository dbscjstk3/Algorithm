import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        int[] p = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            p[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(p);
        int total = 0;
        int sum = 0;
        for (int i : p) {
            sum += i;
            total += sum;
        }
        
        System.out.println(total);
    }
}