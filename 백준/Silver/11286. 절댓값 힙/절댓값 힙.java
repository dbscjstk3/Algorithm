import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	
	static class abs implements Comparable<abs> {
		int x, y;

		public abs(int x) {
			this.x = x;
			this.y = Math.abs(x);
		}

		@Override
		public int compareTo(abs o) {
			if (this.y == o.y)
				return this.x-o.x;
			return this.y-o.y;
		}

		@Override
		public String toString() {
			return String.valueOf(x);
		}
		
		
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		PriorityQueue<abs> pq = new PriorityQueue<>();
		
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			int x = Integer.parseInt(br.readLine());
			
			if (x != 0) {
				pq.add(new abs(x));
			}
			else {
				if (!pq.isEmpty())
					sb.append(pq.poll()+"\n");
				else
					sb.append(0+"\n");
			}
		}
		
		System.out.println(sb);

	}
}
