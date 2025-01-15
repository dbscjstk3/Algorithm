import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int T = Integer.parseInt(br.readLine());
    	
    	for (int t = 1; t <= T; t++) {
    		String word = br.readLine();
    		String result = word.replaceAll("[aeiou]", "");
        	System.out.printf("#%d %s\n", t, result);
    	}
    }
}