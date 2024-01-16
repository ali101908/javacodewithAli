import java.util.Scanner;
public class cwa_ch7_practice {
   /* static int sumRect(int n){
        if(n==1){
            return 1;
        }
        return n + sumRect(n-1);
    }*/
   /* static int fib(int n){
        if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        }
        else{
            return fib(n-1)+fib(n-2);
        }
    }*/
   /* static void pattern1rec(int n){
        if(n>0){
            pattern1rec(n-1);
            for(int i=0;i<n;i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }*/
  /*  static void pattern2(int n){
        for(int i=4;i>=n;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }*/
 /*  static void pattern2rec(int n) {
       if (n <= 4) {
           pattern2rec(n + 1);
           for (int i = 4; i >= n; i--) {
              // for (int j = 1; j <= i; j++) {
                   System.out.print("*");
             //  }
           }
           System.out.println();
       }
   }*/

  /*  static float sum(float ... arr){
        //  static int sum( int x, int ... arr)
        float result=0;
        float avg=0;
        for(float a: arr){
            result +=a;
        }
        float avg =result/arr.length;
        return avg;
    }*/

 static float average(float... arr) {
        float sum = 0;
        for (float e : arr) {
            sum = sum + e;
        }
        float avg = sum / arr.length;
        return avg;
    }

 //   static float fahrenheight(float cel){
//float faren=(cel * (9/5.0f)) + 32.0f;
//return faren;
  //  }

    public static void main(String[] args) {
        //  int c=sumRect(5);
        // System.out.println(c);

        //fibonacci series 0,1,1,2,3,5,8,13,21,34,55
        //  int result= fib(4);
        //  System.out.println(result);

//pattern1rec(4);
        //   pattern2(1);
        //   pattern2rec(1);

        System.out.println("the avg is:" +average(1,7,8,8));


     /*  Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers you want to pass? : ");
        int a = sc.nextInt();
        float[] arr = new float[a];
        for (int i = 0; i < a; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            float el = sc.nextFloat();
            arr[i] = el;
            System.out.println("the avg is" +ave);
        }*/

   //     Scanner sc = new Scanner(System.in);
//float celcius;
//celcius = sc.nextFloat();
      //  System.out.println(celcius + " °C" + " -> " + fahrenheight(celcius) + " °F");

    }
}
