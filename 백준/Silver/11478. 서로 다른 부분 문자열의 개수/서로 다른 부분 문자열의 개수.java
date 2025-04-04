import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Set<String> set = new HashSet<>();

		String str = br.readLine();
		
		for (int i = 0; i < str.length(); i++) {
			String ans = "";
			for (int j = i; j < str.length(); j++) {
				ans += str.charAt(j);
				set.add(ans);
			}
		}
		
		System.out.println(set.size());
	}
}
