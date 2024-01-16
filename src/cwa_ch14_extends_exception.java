import java.util.Scanner;

class MyException extends Exception{
    public String toString(){
        return "i am the to String";
    }

    @Override
    public String getMessage() {
        return "i am the get message";
    }
}

public class cwa_ch14_extends_exception {
    public static void main(String[] args) {
   int a;
   Scanner sc=new Scanner(System.in);
   a=sc.nextInt();
   if(a<9) {
       try {
        //   throw new MyException();
           throw new ArithmeticException("There is an arithmetic exception");
       } catch (Exception e) {
           System.out.println(e.toString());
           System.out.println(e.getMessage());
           e.printStackTrace();
           System.out.println("finished");
       }
       System.out.println("program dead");
   }

    }
}
