import java.io.*;

class Solution
{
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int TC = Integer.parseInt(br.readLine());
		for (int t = 1; t <= TC; t++) {
			int N = Integer.parseInt(br.readLine());
			String quiz = br.readLine();
			String ans = br.readLine();
			int count = 0;
			for (int i = 0; i < N; i++) {
				if (quiz.charAt(i) == ans.charAt(i)) count++;
			}
			System.out.printf("#%d %d\n", t, count);
		}
	}
}