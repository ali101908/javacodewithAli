import java.util.Scanner;
public class cwa_ch4_conditionals {
    public static void main(String[] args) {
/* int age;
        System.out.println("Enter your age");
Scanner sc= new Scanner(System.in);
age=sc.nextInt();
if(age>56){
    System.out.println("you experienced");
}
    else if(age>46){
        System.out.println("you semi exp");
    }
        else{
            System.out.println("inexp");
        }
        if(age>2){
            System.out.println("you baby");
        }

 */
        int year;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter year");
        year= sc.nextInt();
        if(year%4==0 ){
            System.out.println("leap year");
        }
       else{
            System.out.println("not ");
        }
    }
}
