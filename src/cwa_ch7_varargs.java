public class cwa_ch7_varargs {

    static int sum(int ... arr){
      //  static int sum( int x, int ... arr)
        int result=0;
        for(int a: arr){
            result +=a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("welcome to varargs tutorial:");
        System.out.println("the sum of 1 and 2 is " +sum(1 ,2));
        System.out.println("the sum of 1,2 n 5  is " +sum(1 ,2,5));
        System.out.println("the sum of 1,2,7 n 8 is " +sum(1 ,2,7,8));
    }
}
