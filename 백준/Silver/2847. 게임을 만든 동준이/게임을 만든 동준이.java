import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int[] level = new int[N];
		
		for (int i = 0; i < N; i++) {
			level[i] = Integer.parseInt(br.readLine());
		}
		
		int count = 0;
		for (int i = 0; i < N-1; i++) {
			if (level[i] >= level[i+1]) {
				level[i]--;
				count++;
				i = -1;
			}
		}
		
		System.out.println(count);
	}
}