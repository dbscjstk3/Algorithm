import java.util.*;
import java.io.*;


class Solution
{
	public static boolean isPalindrome(int num) {
		String str = Integer.toString(num);
		int len = str.length();
		for (int i = 0; i < len / 2; i++) {
			if (str.charAt(i) != str.charAt(len - 1 - i)) return false;
		}
		return true;
	}
	
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int TC = Integer.parseInt(br.readLine());
		for (int t = 1; t <= TC; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int count = 0;
			for (int i = A; i <= B; i++) {
				if (isPalindrome(i)) {
					int sqrt = (int) Math.sqrt(i);
					if ((sqrt * sqrt == i) && isPalindrome(sqrt)) count++;
				}
			}
			System.out.printf("#%d %d\n", t, count);
		}
		
	}
}