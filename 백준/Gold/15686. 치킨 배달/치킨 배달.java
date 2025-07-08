import java.util.*;
import java.io.*;

public class Main {
    static int N, M;
    static int[][] map;
    static boolean[] visited;
    static List<Pos> houses = new ArrayList<Pos>();
    static List<Pos> chickens = new ArrayList<Pos>();
    static List<Pos> selected = new ArrayList<Pos>();
    static int result = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] == 1) {
                    houses.add(new Pos(i, j));
                }
                else if (map[i][j] == 2) {
                    chickens.add(new Pos(i, j));
                }
            }
        }

        visited = new boolean[chickens.size()];

        btr(0, 0);
        System.out.println(result);
    }

    static void btr(int depth, int start) {
        if (depth == M) {
            int sum = 0;
            for (Pos h : houses) {
                int min =  Integer.MAX_VALUE;
                for (Pos s : selected) {
                    int dist = Math.abs(h.x - s.x) + Math.abs(h.y - s.y);
                    min = Math.min(min, dist);
                }
                sum += min;
            }

            result = Math.min(result, sum);
            return;
        }

        for (int i = start; i < chickens.size(); i++) {
            if (!visited[i]) {
                visited[i] = true;
                selected.add(chickens.get(i));
                btr(depth + 1, i + 1);
                selected.remove(selected.size() - 1);
                visited[i] = false;
            }
        }
    }

    static class Pos {
        int x;
        int y;

        Pos(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
