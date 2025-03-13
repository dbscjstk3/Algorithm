
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	static int[][] paper;
	static int minus,one,zero;
	
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
		
		minus = 0; one = 0; zero = 0;
		recur(0,0,N);
		
		System.out.println(minus);
		System.out.println(zero);
		System.out.println(one);
	}
	
	static void recur(int row, int col, int size) {
		if (isSame(row,col,size)) {
			if (paper[row][col] == -1) minus++;
			else if (paper[row][col] == 0) zero++;
			else one++;
			
			return;
		}
		
		int cutsize = size/3;
		
		recur(row, col, cutsize);
		recur(row, col+cutsize, cutsize);
		recur(row, col+cutsize*2, cutsize);
		recur(row+cutsize, col, cutsize);
		recur(row+cutsize, col+cutsize, cutsize);
		recur(row+cutsize, col+cutsize*2, cutsize);
		recur(row+cutsize*2, col, cutsize);
		recur(row+cutsize*2, col+cutsize, cutsize);
		recur(row+cutsize*2, col+cutsize*2, cutsize);
	}
	
	
	
	static boolean isSame(int row, int col, int size) {
		int num = paper[row][col];
		
		for (int i = row; i < row+size; i++) {
			for (int j = col; j < col+size; j++) {
				if (paper[i][j] != num) {
					return false;
				}
			}
		}
		return true;
	}
}