import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static final double PI = 3.141592;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[][] rooms = new int[7][2]; //여자0남자1
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int sex = Integer.parseInt(st.nextToken());
			int grade = Integer.parseInt(st.nextToken());

			rooms[grade][sex]++;
		}

		int count = 0;
		for (int i = 1; i < 7; i++) {
			for (int j = 0; j < 2; j++) {
				if (rooms[i][j] > 0 && rooms[i][j] <= K) count++;
				else if (rooms[i][j] > K) {
					count += (rooms[i][j] / K) + (rooms[i][j] % K);
				}
			}
		}

		System.out.println(count);
	}
}