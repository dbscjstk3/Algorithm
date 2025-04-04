import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		Set<String> set = new HashSet<>();
		
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			set.add(str);
		}
		
		int count = 0;
		for (int i = 0; i < M; i++) {
			String str = br.readLine();
			if (set.contains(str))
				count++;
		}
		
		System.out.println(count);
	}
}
