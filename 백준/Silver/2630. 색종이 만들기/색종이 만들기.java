
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	static int[][] paper;
	static int white, blue;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		paper = new int[N][N];
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				paper[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		white = 0;
		blue = 0;
		recur(0,0,N);
		
		System.out.println(white);
		System.out.println(blue);
	}
	
	static void recur(int row, int col, int size) {
		if (checkColor(row,col,size)) {
			if (paper[row][col] == 0) white++;
			else blue++;
			
			return;
		}
		
		int half = size/2;
		
		recur(row, col+half, half); //1사분면
		recur(row, col, half); //2사분면
		recur(row+half, col, half); //3사분면
		recur(row+half, col+half, half); //4사분면
	}
	
	
	
	static boolean checkColor(int row, int col, int size) {
		int color = paper[row][col];
		
		for (int i = row; i < row+size; i++) {
			for (int j = col; j < col+size; j++) {
				if (paper[i][j] != color) {
					return false;
				}
			}
		}
		return true;
	}
}