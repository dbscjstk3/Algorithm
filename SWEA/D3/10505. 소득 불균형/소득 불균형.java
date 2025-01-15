import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        for (int i = 1; i <= T; i++) {
        	int N = Integer.parseInt(br.readLine());
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int[] income = new int[N];
        	int sum = 0;
        	
        	for (int j = 0; j < N; j++) {
        		income[j] = Integer.parseInt(st.nextToken());
        		sum += income[j];
        	}
        	
        	double average = (double) sum/N;
        	int cnt = 0;
        	
        	for (int j = 0; j < N; j++) {
        		if (income[j] <= average) cnt++;
        	}
        	System.out.printf("#%d %d\n", i, cnt);
        }
    }
}