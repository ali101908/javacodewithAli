import java.util.Scanner;


public class cwa_ch9_guessnum {
    public static void main(String[] args) {
int answer=(int)(Math.random()*100)+1;
int k=5;
Scanner input= new Scanner(System.in);
boolean correct=false;
        System.out.println("Thinking of a num between 0 to 100\n");
        while(k>0) {
            System.out.println("Enter ur guess:");
            int guess = input.nextInt();
            if(guess==answer){
                System.out.println("you guessed right\n you win");
                break;
            }
            else if(guess>answer){
                System.out.println("you guessed too high\n you have" );
                k--;
            }
            else {
                System.out.println("you guessed too low \n you have" );
            }
            k--;
        }
        if(correct==false){
            System.out.println("you ran out of trials\n you lose!");
        }
    }
}
