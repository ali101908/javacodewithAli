public class cwa_ch14_finally {
    public static int greet(){
        try {
            int a = 10;
            int b = 2;
            int c = a / b;
            return c;
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("this is the dead end");
        }
       return -1;
    }
    public static void main(String[] args) {
    int d=greet();
        System.out.println(d);
        int a=8;
        int b=3;
        while(true){
        try{
            System.out.println(a/b);
        }
        catch (Exception e){
            System.out.println(e);
            break;
        }
        finally {
            System.out.println("i am the finally for value of b " +b);
        }
        b--;
        }
    }
}
