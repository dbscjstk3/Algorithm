import java.io.*;
import java.util.*;

public class Main {

    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int student = Integer.parseInt(st.nextToken());
        int room = Integer.parseInt(st.nextToken());
        int[][] array = new int[6][2];

        for (int i=0; i< student;i++){
            st = new StringTokenizer(br.readLine());
            int sex = Integer.parseInt(st.nextToken());
            int grade = Integer.parseInt(st.nextToken())-1;

            array[grade][sex]++;
        }
            int count = 0;
        for(int i=0;i<=5;i++){

            for(int j=0; j<2;j++){
                int result = array[i][j];

               if(result==0) continue;
               else if (result%room==0) {
                   count = count + result/room;
               } else if (result >= room) {
                   count = count + (result/room)+1;
               }else count++;
            }
        }
        System.out.println(count);
    }
}