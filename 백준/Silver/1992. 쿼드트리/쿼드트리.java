
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	static int[][] grid;
	static StringBuilder sb;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		grid = new int[N][N];
		
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			for (int j = 0; j < N; j++) {
				grid[i][j] = str.charAt(j)-'0';
			}
		}
		
		sb = new StringBuilder();
		recur(0,0,N);
		
		System.out.println(sb.toString());
	}
	
	static void recur(int row, int col, int size) {
		if (isSame(row,col,size)) {
			if (grid[row][col] == 0) sb.append("0");
			else sb.append("1");
			
			return;
		}
		
		int half = size/2;
		sb.append("(");
		recur(row, col, half);
		recur(row, col+half, half);
		recur(row+half, col, half);
		recur(row+half, col+half, half);
		sb.append(")");
	}
	
	
	
	static boolean isSame(int row, int col, int size) {
		int num = grid[row][col];
		
		for (int i = row; i < row+size; i++) {
			for (int j = col; j < col+size; j++) {
				if (grid[i][j] != num) {
					return false;
				}
			}
		}
		return true;
	}
}