import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    static int[] sorted;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Set<String> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }

        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < M; i++) {
            String str = br.readLine();
            if (set.contains(str)) {
                ans.add(str);
            }
        }

        Collections.sort(ans);
        for (String name : ans) {
            sb.append(name+"\n");
        }

        System.out.println(ans.size());
        System.out.println(sb);
    }
}
