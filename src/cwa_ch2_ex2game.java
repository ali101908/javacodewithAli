import java.util.Random;
import java.util.Scanner;

public class cwa_ch2_ex2game {
    public static void main(String[] args) {
// 0 for rock
// 1 for paper
// 2 for scissor

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for rock, 1 for paper n 2 for scissor:");
        int userinput = sc.nextInt();

        Random rn = new Random();
        int computerinput = rn.nextInt(3);

        if (userinput == computerinput) {
            System.out.println("Draw");
        } else if (userinput == 0 && computerinput == 2 || userinput == 1 && computerinput == 0 || userinput == 2 && computerinput == 1) {
            System.out.println("You win");
        } else {
            System.out.println("computer win");
        }
       // System.out.println("computer choice:" + computerinput);

        if (computerinput == 0) {
            System.out.println("computer choice: Rock");
        } else if (computerinput == 1) {
            System.out.println("computer choice: paper");
        } else if (computerinput == 2) {
            System.out.println("computer choice: scissor");
        }
    }
}
