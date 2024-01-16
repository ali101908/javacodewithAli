import java.util.Scanner;

class MineException extends Exception{

    @Override
    public String getMessage() {
        return "Error";
    }
}

public class cwa_ch14_practice_set {
    public static void throwexception(int i) throws MineException{
        if(i>=5){
            throw new MineException();
        }
    }
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 10;
        marks[1] = 27;
        marks[2] = 56;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int i=0;
        while (flag && i<5) {
            System.out.println("Enter the array index");
            int index = sc.nextInt();
            try{
                System.out.println("the value of array index is marks[index]" +marks[index]);
                break;
            }
            catch (Exception e){
                System.out.println("invalid input");
                i++;
            }
        }
        if(i>=5){
            try{
                throwexception(i);
            }
            catch(MineException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
