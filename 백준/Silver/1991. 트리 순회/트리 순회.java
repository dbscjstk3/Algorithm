import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static char[] tree;
	static int[] leftChild;
	static int[] rightChild;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		tree = new char[N+1];
		leftChild = new int[N+1];
		rightChild = new int[N+1];
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			char parent = st.nextToken().charAt(0);
			char left = st.nextToken().charAt(0);
			char right = st.nextToken().charAt(0);
			
			int idx = parent - 'A' + 1;
			tree[idx] = parent;
			
			leftChild[idx] = (left == '.') ? 0 : (left - 'A' + 1);
			rightChild[idx] = (right == '.') ? 0 : (right - 'A' + 1);
		}
		
		preOrder(1);
		System.out.println();
		inOrder(1);
		System.out.println();
		postOrder(1);
	}
	
	public static void preOrder(int root) {
		if (root == 0) return;
		System.out.print(tree[root]);
		preOrder(leftChild[root]);
		preOrder(rightChild[root]);
	}
	
	public static void inOrder(int root) {
		if (root == 0) return;
		inOrder(leftChild[root]);
		System.out.print(tree[root]);
		inOrder(rightChild[root]);
	}
	
	public static void postOrder(int root) {
		if (root == 0) return;
		postOrder(leftChild[root]);
		postOrder(rightChild[root]);
		System.out.print(tree[root]);
	}
}