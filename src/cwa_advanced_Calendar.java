import java.util.Calendar;

public class cwa_advanced_Calendar {
    public static void main(String[] args) {
     //   Calendar C= Calendar.getInstance();
       // System.out.println(C.getCalendarType());
        //System.out.println(C.getFirstDayOfWeek());

        Calendar C= Calendar.getInstance();
        System.out.println(C.getCalendarType());
      //  System.out.println(C.getFirstDayOfWeek());
        System.out.println(C.getTimeZone().getID());
    }
}
