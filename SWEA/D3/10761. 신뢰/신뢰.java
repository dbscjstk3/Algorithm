import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			String[] button = new String[N * 2];

			for (int i = 0; i < button.length; i++) {
				button[i] = st.nextToken();
			}

			int orange = 1; // 오렌지의 현재 위치
			int blue = 1; //블루의 현재 위치
			int time = 0; //총 걸린 시간
			int oTime = 0; //오렌지가 버튼을 누르기까지 걸린 시간
			int bTime = 0; //블루가 버튼을 누르기까지 걸린 시간간
			for (int i = 0; i < button.length; i += 2) {
				int target = Integer.parseInt(button[i+1]);
				if (button[i].equals("B")) {
					int moveTime = Math.abs(target-blue)+1;
					bTime += moveTime;
					if (bTime > time) time = bTime;
					else {
						time++;
						bTime = time;
					}
					blue = target;
				}
				else if (button[i].equals("O")) {
					int moveTime = Math.abs(target-orange)+1;
					oTime += moveTime;
					if (oTime > time) time = oTime;
					else {
						time++;
						oTime = time;
					}
					orange = target;
				}
			}
			
			System.out.printf("#%d %d\n", tc, time);
		}
        br.close();
	}
}