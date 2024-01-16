import java.util.Scanner;

public class cwa_ch14_exception {
    public static void main(String[] args) {
        int [] marks=new int[3];
        marks[0]=10;
        marks[1]=27;
        marks[2]=56;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array index");
        int ind=sc.nextInt();

        System.out.println("Enter the number divided by array");
        int number= sc.nextInt();
        try{
            System.out.println("The value at array index entered is:" +marks[ind]);
            System.out.println("The value of array-value/number is:" +marks[ind]/number);
        }
        catch(ArithmeticException e){
            System.out.println("There is an arithmetic exception!");
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("There is an ArrayIndexOutOfBoundsException!");
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println("There is some other exception!");
            System.out.println(e);
        }
    }
}
