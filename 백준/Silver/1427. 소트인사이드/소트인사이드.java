import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String num = br.readLine();
		List<Integer> ans = new ArrayList<>();
		
		for (int i = 0; i < num.length(); i++) {
			ans.add(Character.getNumericValue(num.charAt(i)));
		}
		
		ans.sort(Comparator.reverseOrder());
		
		for (int n : ans) {
			sb.append(n);
		}
		
		System.out.println(sb);
	}
}
