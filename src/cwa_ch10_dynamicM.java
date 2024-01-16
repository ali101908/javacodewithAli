import java.util.Random;
import java.util.Scanner;

class Game{
   public int number;
   public int noofguesses=0;
   public int inputNumber;

    public int getNoofguesses() {
        return noofguesses;
    }

    public void setNoofguesses(int noofguesses) {
        this.noofguesses = noofguesses;
    }
    Game(){
    Random rand=new Random();
    this.number=rand.nextInt(100);
    }
    void takeuserinput(){
        System.out.println("guess the number:");
        Scanner sc=new Scanner(System.in);
        inputNumber= sc.nextInt();
    }
    boolean iscorrectnumber(){
        noofguesses++;
        if (inputNumber == number) {
            System.out.format("you have guessed it right,it was %d\nYou guessed it in %d attempts ",number,noofguesses);
            return true;
        }
        else if(inputNumber>number){
            System.out.println("its too low");
        }
        else if(inputNumber<number){
            System.out.println("its too high");
        }
        return false;
    }
}

public class cwa_ch10_dynamicM {
    public static void main(String[] args) {
        Game g=new Game();
        boolean b=false;
while(!b){
g.takeuserinput();
b=g.iscorrectnumber();
  //  System.out.println(b);
}
    }
}
