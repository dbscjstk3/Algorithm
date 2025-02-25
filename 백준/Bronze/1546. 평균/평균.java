import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        double[] arr = new double[N];
        double avg, max = 0, sum = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Double.parseDouble(st.nextToken());
            
            if (arr[i] > max) {
            	max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
        	arr[i] = (arr[i]/max) * 100;
        	sum += arr[i];
        }
        br.close();
        
        avg = sum / N;
        System.out.println(avg);
    }
}