import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       int n = Integer.parseInt(br.readLine());
       int[] arr = new int[n];
       for (int i = 0; i < n; i++) {
        arr[i] = Integer.parseInt(br.readLine());
       }

       Arrays.sort(arr);
       int len = arr.length;
       int trim = (int) Math.round(len * 0.15);
       int[] arr1 = Arrays.copyOfRange(arr, trim, len-trim);
       double total = 0;
       for (int num : arr1) {
        total += num;
       }
       int avg = (int) Math.round(total/arr1.length);
       System.out.println(avg);
    }
}