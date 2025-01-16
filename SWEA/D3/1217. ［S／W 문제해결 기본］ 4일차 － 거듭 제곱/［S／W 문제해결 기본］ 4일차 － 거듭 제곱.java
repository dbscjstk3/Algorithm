import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        for (int i = 1; i <= 10; i++) {
            int N = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();
            int result = pow(A,B);
            
            System.out.printf("#%d %d\n", N, result);
        }
    }

public static int pow(int n, int m) {
    if (m == 1) {
        return n;
    }
    return n * pow(n, m-1);
}}