public class cwa_ch14_try_catch {
    public static void main(String[] args) {
        int a=9000;
        int b=0;
        try {
            int c = a / b;
            System.out.println("The answer of c is:" + c);
        }
        catch(Exception e){
            System.out.println("The reason for not dividing is:");
            System.out.println(e);
        }
        System.out.println("the program is ended");
    }
}
