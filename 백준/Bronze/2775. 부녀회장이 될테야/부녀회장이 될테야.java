import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        for (int tc = 0; tc < T; tc++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            
            int answer = recur(k,n);
            System.out.println(answer);
        }
    }
    
    static int recur(int a, int b) {
        if (a == 0) return b;
        
        int sum = 0;
        for (int i = 1; i <= b; i++) {
            sum += recur(a - 1, i);
        }
        
        return sum;
    }
}