import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
	
	static String[][] tree;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for (int tc = 1; tc <= 10; tc++) {
			int N = Integer.parseInt(br.readLine());
			tree = new String[N+1][3];
			
			for (int i = 1; i <= N; i++) {
				String[] input = br.readLine().split(" ");
				int num = Integer.parseInt(input[0]);
				String c = input[1];
				tree[num][0] = c;
				if (c.charAt(0) >= 42 && c.charAt(0) <= 47) {
					tree[num][1] = input[2];
					tree[num][2] = input[3];
				}
			}
			
			System.out.printf("#%d %d\n",tc,(int)postOrder(1));
		}
	}
	
	static double postOrder(int root) {
		if (root >= tree.length) {
			return 0;
		}
		
		if (tree[root][0].charAt(0) >= 42 && tree[root][0].charAt(0) <= 47) {
			double sum = 0;
			switch (tree[root][0].charAt(0)) {
			case '+' : 
				sum = postOrder(Integer.parseInt(tree[root][1])) + postOrder(Integer.parseInt(tree[root][2]));
				break;
			case '-' :
				sum = postOrder(Integer.parseInt(tree[root][1])) - postOrder(Integer.parseInt(tree[root][2]));
				break;
			case '*' :
				sum = (double) postOrder(Integer.parseInt(tree[root][1])) * postOrder(Integer.parseInt(tree[root][2]));
				break;
			case '/' :
				sum = (double) postOrder(Integer.parseInt(tree[root][1])) / postOrder(Integer.parseInt(tree[root][2]));
				break;
			}
			return sum;
		}
		else return Double.parseDouble(tree[root][0]);
	}
}