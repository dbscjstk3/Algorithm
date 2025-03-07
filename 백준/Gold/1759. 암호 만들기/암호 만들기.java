import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int L, C;
	static char[] pwd;
	static char[] ans;
	static StringBuilder sb;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		sb = new StringBuilder();

		L = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		pwd = new char[C];
		ans = new char[L];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < C; i++) {
			pwd[i] = st.nextToken().charAt(0);
		}

		Arrays.sort(pwd);
		comb(0, 0);
		System.out.println(sb.toString());
	}

	static void comb(int depth, int start) {
		if (depth == L) {
			if (isValid()) {
				sb.append(ans).append("\n");
			}
			return;
		}

		for (int i = start; i < C; i++) {
			ans[depth] = pwd[i];
			comb(depth + 1, i + 1);
		}
	}

	static boolean isValid() {
		int vowel = 0;
		int consonant = 0;

		for (char ch : ans) {
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				vowel++;
			else
				consonant++;
		}

		if (vowel >= 1 && consonant >= 2) {
			for (int i = 0; i < L - 1; i++) {
				if (ans[i] > ans[i + 1])
					return false;
			}
		} else
			return false;

		return true;
	}
}