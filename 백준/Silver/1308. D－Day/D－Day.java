import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.time.*;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        LocalDate date = LocalDate.of(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        st = new StringTokenizer(br.readLine());
        LocalDate targDate = LocalDate.of(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));

        if (ChronoUnit.YEARS.between(date, targDate) >= 1000) System.out.println("gg");
        else {
            System.out.println("D-" + ChronoUnit.DAYS.between(date, targDate));
        }

    }
}