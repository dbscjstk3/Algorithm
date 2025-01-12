import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        double SumGradexScore = 0;
        double SumGrade = 0;
        for (int i = 0; i < 20; i++) {
            st = new StringTokenizer(br.readLine());
            String subject = st.nextToken();
            double grade = Double.parseDouble(st.nextToken());
            String Alphabet = st.nextToken();
            double score = 0;
            
            if (!(Alphabet.equals("P"))) {
            	switch (Alphabet) {
            	case "A+" :
            		score = 4.5;
            		break;
            	case "A0" :
            		score = 4.0;
            		break;
            	case "B+" :
            		score = 3.5;
            		break;
            	case "B0" :
            		score = 3.0;
            		break;
            	case "C+" :
            		score = 2.5;
            		break;
            	case "C0" :
            		score = 2.0;
            		break;
            	case "D+" :
            		score = 1.5;
            		break;
            	case "D0" :
            		score = 1.0;
            		break;
            	case "F" :
            		score = 0.0;
            		break;
            	default:
            		break;
            	}
            	
            	SumGradexScore += (grade*score);
            	SumGrade += grade;
            }            
        }
        System.out.printf("%.6f", SumGradexScore/SumGrade);
    }
}