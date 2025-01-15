import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int TC = Integer.parseInt(br.readLine());
    	for (int t = 1; t <= TC; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
    		int ans = 0;
    		if (A > 9 || B > 9) ans = -1;
    		else ans = A * B;
    		System.out.printf("#%d %d\n", t, ans);
    	}
    }
}