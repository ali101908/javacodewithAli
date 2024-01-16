import java.util.Scanner;

public class cwa_ch14_nested_try_catch {
    public static void main(String[] args) {
        int [] marks=new int[3];
        marks[0]=10;
        marks[1]=27;
        marks[2]=56;
        Scanner sc=new Scanner(System.in);
        boolean flag=true;
        while(true) {
            System.out.println("Enter the array index");
            int ind = sc.nextInt();
            try {
                System.out.println("welcome to nested try catch");
                try {
                    System.out.println(marks[ind]);
                    flag = false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Sorry this index does not exist");
                    System.out.println("Exception level 2");

                }
            }
                catch (Exception e) {
                    System.out.println("Exception level 1");
                }
            }
    }
}
