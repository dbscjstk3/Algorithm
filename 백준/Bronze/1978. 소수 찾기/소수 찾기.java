import java.util.*;
//import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int count = 0;
		for (int t = 0; t < n; t++) {
			int input = sc.nextInt();

			boolean isPrime = true;

			if (input == 1) continue;
			for (int i = 2; i < input; i++) {
				if (input % i == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) count++;
		}
		System.out.println(count);
	}
}