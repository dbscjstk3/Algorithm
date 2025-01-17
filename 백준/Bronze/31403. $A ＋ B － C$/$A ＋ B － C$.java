import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       //StringBuilder sb = new StringBuilder();

       int A = Integer.parseInt(br.readLine());
       int B = Integer.parseInt(br.readLine());
       int C = Integer.parseInt(br.readLine());
       int intans = A+B-C;

       String s = "";
       s += A;
       s += B;
       int AB = Integer.parseInt(s);
       int stringans = AB - C;

       System.out.println(intans);
       System.out.println(stringans);
    }
}