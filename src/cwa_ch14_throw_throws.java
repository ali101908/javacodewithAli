class NegativeRadiusException extends Exception{
    public String toString(){
        return "Radius value cannot be negative! ";
    }

    @Override
    public String getMessage() {
        return "Radius cannot be negative! ";
    }
}

public class cwa_ch14_throw_throws {
    public static double area(int r) throws NegativeRadiusException{
        if(r<0){
            throw new NegativeRadiusException();
        }
        double RESULT=Math.PI*r*r;
        return RESULT;
    }
    public static void main(String[] args) {
try{
    double ar=area(3);
    System.out.println(ar);
}
catch (Exception e){
    System.out.println("Exception");
}
    }
}
