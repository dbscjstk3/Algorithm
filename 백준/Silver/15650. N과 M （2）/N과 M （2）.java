import java.io.*;

public class Main {
    static int[] arr;
    static int N, M;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);

        arr = new int[M];

        permutation(1, 0);
        System.out.print(sb.toString()); // 한 번에 출력하여 속도 최적화
    }

    static void permutation(int start, int depth) {
        if (depth == M) {
            for (int num : arr) {
                sb.append(num).append(" ");
            }
            sb.append("\n"); // 줄바꿈 추가
            return;
        }

        for (int i = start; i <= N; i++) {
            arr[depth] = i;
            permutation(i + 1, depth + 1);
        }
    }
}
