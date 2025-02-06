import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++)
		{
            int[] arr = new int[10];
            for (int i = 0; i < 10; i++) {
                arr[i] = sc.nextInt();
		}
            int max = 0;
            for (int i = 0; i < 10; i++) {
                if (arr[i] > max) max = arr[i];
            }
            System.out.printf("#%d %d\n",test_case, max);
        }
    }
}