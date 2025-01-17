import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       int N = Integer.parseInt(br.readLine());
       int[] sizes = new int[6];
       StringTokenizer st = new StringTokenizer(br.readLine());
       for (int i = 0; i < 6; i++) {
        sizes[i] = Integer.parseInt(st.nextToken());
       }
       st = new StringTokenizer(br.readLine());
       int T = Integer.parseInt(st.nextToken());
       int P = Integer.parseInt(st.nextToken());

       int totalTShirtBundles = 0;
       for (int size : sizes) {
           totalTShirtBundles += (size + T - 1) / T; // 필요한 티셔츠 묶음 개수 계산
        }

       int pencil = N / P;
       int remain = N % P;
       System.out.println(totalTShirtBundles);
       System.out.println(pencil + " " + remain);
    }
}