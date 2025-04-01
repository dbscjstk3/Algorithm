import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {

    static class Node implements Comparable<Node> {
        int idx, cost;

        public Node(int idx, int cost) {
            this.idx = idx;
            this.cost = cost;
        }

        @Override
        public int compareTo(Node o) {
            return Integer.compare(this.cost, o.cost);
        }
    }

    static final int INF = Integer.MAX_VALUE;
    static int N, M;
    static List<List<Node>> graph;
    static int[] dist;
    static boolean[] check;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        graph = new ArrayList<>();
        for (int i = 0; i < N + 1; i++) {
            graph.add(new ArrayList<Node>());
        }

        dist = new int[N + 1];
        check = new boolean[N + 1];

        Arrays.fill(dist, INF);
        dist[1] = 0;

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());

            graph.get(s).add(new Node(e, cost));
            graph.get(e).add(new Node(s, cost));
        }

        dijkstra();
        System.out.println(dist[N]);
    }

    static void dijkstra() {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(1, dist[1]));

        while (!pq.isEmpty()) {
            int currIdx = pq.poll().idx;
            check[currIdx] = true;

            for (Node next : graph.get(currIdx)) {
                if (!check[next.idx] && dist[next.idx] > dist[currIdx] + next.cost) {
                    dist[next.idx] = dist[currIdx] + next.cost;

                    pq.add(new Node(next.idx, dist[next.idx]));
                }
            }
        }
    }
}