import java.io.*;

public class Main {
    static int[] arr;
    static boolean[] visit;
    static int N, M;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);

        arr = new int[M];
        visit = new boolean[N + 1];

        permutation(0);
        System.out.print(sb.toString());
    }

    static void permutation(int depth) {
        if (depth == M) {
            for (int num : arr) {
                sb.append(num).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 1; i <= N; i++) {
            if (!visit[i]) {
                visit[i] = true;
                arr[depth] = i;
                permutation(depth + 1);
                visit[i] = false;
            }
        }
    }
}
