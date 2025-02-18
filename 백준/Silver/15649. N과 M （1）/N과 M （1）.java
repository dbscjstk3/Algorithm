import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static int N, M;
	static boolean[] visited;
	static List<Integer> sequence;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		// 1 ~ N까지 중복없이 길이 M의 수열 모두 출력
		// 1 -> N: 탐색 방향 정해짐: 깊이 내려감
		// 종료 조건: M개 선택 완료
		// 모두 출력: 재귀
		// 중복 사용 안됨: 이전에 사용했던 숫자 사용 못하게 막기(이게 깊이인가?)
		
		visited = new boolean[N + 1]; // 방문 여부 체크
		sequence = new ArrayList<>(); // 현재 선택한 숫자들 저장
		
		backtrack(0);
		sc.close();
	}
	
	static void backtrack(int depth) {
		if (depth == M) { // 선택 개수 = M개일 때
			for (int num : sequence) {
				System.out.print(num + " ");
			}
			System.out.println();
			return;
		}
		
		for (int i = 1; i <= N; i++) {
			if (!visited[i]) { // i가 방문하지 않은 숫자일때
				visited[i] = true;
				sequence.add(i); // 저장
				
				backtrack(depth + 1); // 다음 숫자 고르기
				
				//M까지 고른 후 출력하고 다시 여기
				visited[i] = false; // 다시 원상 복구
				sequence.remove(sequence.size() - 1); 
				// depth = 자리수 -> 해당 자리수만 초기화해서 N까지 모두 보기
				// i = 1: 1 2 3 1 -> 1 지우기 -> i = 2: 1 2 3 2 ->....
				// 그리고 이건 모두 M자리수부터 계속 내려오고 올라온 것의 반복임
			}
		}
		
		
		
	}

}
