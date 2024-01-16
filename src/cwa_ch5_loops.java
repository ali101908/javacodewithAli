import java.util.Scanner;
public class cwa_ch5_loops {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter variable");
        int num;
        num=sc.nextInt();
        for(int i=num; i>=1; i--){
            System.out.println(i);
        }

    }
}
