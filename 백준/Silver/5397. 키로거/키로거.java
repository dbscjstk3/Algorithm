import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		for (int tc = 0; tc < T; tc++) {
			StringBuilder sb = new StringBuilder();
			String str = br.readLine();
			List<Character> pswd = new LinkedList<>();
			
			int idx = 0;
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				switch (ch) {
				case '<' :
					if (idx > 0) idx -= 1;
					break;
				case '>' :
					if (idx < pswd.size()) idx += 1;
					break;
				case '-' :
					if (idx > 0 && !pswd.isEmpty()) pswd.remove(idx-- -1);
					break;
				default :
					pswd.add(idx, ch);
					idx++;
					break;
				}
			}
			
			for (char c : pswd) {
				sb.append(c);
			}
			
			System.out.println(sb.toString());
		}
	}
}