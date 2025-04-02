import java.io.*;
import java.util.*;

public class Main {
	static char[] vowel = {'a','e','i','o','u', 'A', 'E','I','O','U'};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input;
		
		while (!(input = br.readLine()).equals("#")) {
			int count = 0;
			for (int i = 0; i < input.length(); i++) {
				for (int j = 0; j < vowel.length; j++) {
					if (vowel[j] == input.charAt(i)) {
						count++;
					}
				}
			}
			
			System.out.println(count);
		}
	}
}
