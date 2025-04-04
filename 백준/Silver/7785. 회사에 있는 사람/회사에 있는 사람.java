import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		Map<String, Integer> map = new HashMap<>();
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			String name = st.nextToken();
			String log = st.nextToken();
			
			map.put(name, map.getOrDefault(name, 0)+1);
		}
		
		List<String> ans = new ArrayList<>();
		
		for (String key : map.keySet()) {
			int value = map.get(key);
			
			if (value % 2 != 0)
				ans.add(key);
		}
		
		ans.sort(Comparator.reverseOrder());
		
		for (String name : ans) {
			System.out.println(name);
		}
	}
}
