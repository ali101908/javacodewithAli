public class cwa_ch15_miliSec {
    public static void main(String[] args) {
        System.out.println( "Number of seconds Passed" +System.currentTimeMillis()/1000);
        System.out.println( "Number of hours Passed" +System.currentTimeMillis()/1000/3600);
        System.out.println( "Number of days Passed" +System.currentTimeMillis()/1000/3600/24);
        System.out.println( "Number of years Passed" +System.currentTimeMillis()/1000/3600/24/365);
    }
}
