import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static final double PI = 3.141592;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		for (int tc = 0; tc < T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int floor = Integer.parseInt(st.nextToken());
			int room = Integer.parseInt(st.nextToken());
			int guest = Integer.parseInt(st.nextToken());

			int roomNumber = 0;

			if (guest % floor == 0) {
				roomNumber = guest / floor;
				floor *= 100;
			}
			else {
				roomNumber = guest / floor + 1;
				floor = (guest % floor) * 100;
			}

			System.out.println(floor + roomNumber);
		}
	}
}