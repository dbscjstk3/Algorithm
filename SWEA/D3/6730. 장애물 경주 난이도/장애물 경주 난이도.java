import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        for (int t = 1; t <= T; t++) {
        	int N = Integer.parseInt(br.readLine());
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int[] height = new int[N];
        	int max = 0;
        	int min = 0;
        	for (int i = 0; i < N; i++) {
        		height[i] = Integer.parseInt(st.nextToken());
        	}
        	for (int i = 0; i < height.length-1; i++) {
        		if (height[i] < height[i+1]) {
        			int gap = height[i+1] - height[i];
        			if (gap > max) max = gap;
        		}
        		else {
        			int gap = height[i] - height[i+1];
        			if (gap > min) min = gap;
        		}
        	}
        	System.out.printf("#%d %d %d\n", t, max, min);
        }
    }
}
