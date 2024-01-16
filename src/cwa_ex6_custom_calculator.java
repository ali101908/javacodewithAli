
class invalidinputException extends Exception{
    @Override
    public String toString() {
        return " 8 n 9 are not allowed";
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
class cannotdivideException extends Exception{
    @Override
    public String toString() {
        return " 0 is ot divisible ";
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
class MaxInputException extends Exception{
    @Override
    public String toString() {
        return "input above 10000 is not allowed";
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
class MaxMultiplyException extends Exception{
    @Override
    public String toString() {
        return "not possible to multiply with num above 7000";
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
class CustomCalculator{
    double add(int a,int b) throws invalidinputException{
        if(a==8 || b==9){
            throw new invalidinputException();
        }
        return a+b;
    }
    double subtract(int a,int b){
        return a-b;
    }
    double multiply(int a,int b)throws MaxInputException,MaxMultiplyException{
        if (a>10000 || b>10000){
            throw new MaxInputException();
        }
        else if (a>7000 || b>7000) {
            throw new  MaxMultiplyException();
        }
        return a*b;
    }
    double divide(int a,int b)throws cannotdivideException{
        if(a==0 || b==0){
            throw new cannotdivideException();
        }
        return a/b;
    }
}

public class cwa_ex6_custom_calculator {
    public static void main(String[] args) throws invalidinputException,cannotdivideException,MaxMultiplyException,MaxInputException{
        CustomCalculator cc=new CustomCalculator();
     //   cc.add(8,4);
      //  cc.divide(9,0);
        cc.multiply(11000,30);

    }
}
