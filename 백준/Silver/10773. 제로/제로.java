import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N =Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int input;
        for (int i = 0; i < N; i++) {
            if ((input = Integer.parseInt(br.readLine())) != 0) {
                stack.push(input);
            }
            else {
                stack.pop();
            }
        }
        
        int total = 0;
        for (int num : stack) {
            total += num;
        }
        System.out.println(total);
    }
}