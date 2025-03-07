import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int[] arr;
    static int N, M;
    static boolean[] visit;
    static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];
        visit = new boolean[N + 1];
       
        permutation(0);
        bw.flush();
        bw.close();
    }

    static void permutation(int depth) throws IOException {
        if (depth == M) {
            for (int num : arr) {
                bw.write(num + " ");
            }
            bw.write("\n");

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