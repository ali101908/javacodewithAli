import java.util.GregorianCalendar;
import java.util.TimeZone;

public class cwa_ch15_gregorian {
    public static void main(String[] args) {
        GregorianCalendar cal=new GregorianCalendar();
        System.out.println(cal.isLeapYear(2020));
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);
    }
}
