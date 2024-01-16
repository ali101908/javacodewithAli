import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class cwa_ch15_DateTimeFormat {
    public static void main(String[] args) {
        LocalDateTime dt=LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd-MM-yyyy --E a");
        DateTimeFormatter df2=DateTimeFormatter.ISO_LOCAL_DATE;
        String myDate=dt.format(df);
        System.out.println(myDate);
    }
}
