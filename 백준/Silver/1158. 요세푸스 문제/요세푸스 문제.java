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
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		Deque<Integer> order = new LinkedList<>();
		Deque<Integer> dq = new LinkedList<>();
		
		for (int i = 1; i <= N; i++) {
			dq.add(i);
		}
		
		for (int i = 1; i <= K; i++) {
			order.add(i);
		}
		
		while (!dq.isEmpty()) {
			int num = dq.poll();
			int idx = order.poll();
			
			if (idx == K) {
				if (dq.isEmpty()) sb.append(num + ">");
				else sb.append(num + ", ");
			}
			else dq.add(num);
			
			order.add(idx);
		}
		System.out.println(sb.toString());
	}

}