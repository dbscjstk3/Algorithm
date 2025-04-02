import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<ArrayList<Integer>> graph;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        graph = new ArrayList<>();

        for (int i = 0; i <= n; i++) graph.add(new ArrayList<>());
        int ans = 0;
        visited = new boolean[n + 1];
        visited[1] = true;

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            //양방향 그래프
            graph.get(start).add(end);
            graph.get(end).add(start);
        }

        bfs(1, 0);

        for (int i = 2; i < n + 1; i++) { //상근이를 제외하고 세기
            if (visited[i]) ans++;
        }
        System.out.println(ans);

        br.close();
    }

    static void bfs(int num, int depth) {
        if (depth == 2) { // 친구의 친구까지만
            return;
        }
        for (int i : graph.get(num)) {
            visited[i] = true;
            bfs(i, depth + 1);
        }
    }
}