@FunctionalInterface
interface demoAno{
  //  void meth7();
    void meth7(int a);
  //  void meth8();
}


public class cwa_advanced2_lambda {
    public static void main(String[] args) {
        // Anonymous Class
      /*  demoAno obj=new demoAno() {
            @Override
            public void meth7() {
                System.out.println("jiyo");
            }

            @Override
            public void meth8() {
                System.out.println("ahahahah");
            }
        };
        obj.meth7();

       */
        // Lambda Expressions
      //  demoAno obj=()->{
      //      System.out.println("i am the king");
     //   };
      //  obj.meth7();

        demoAno obj=(a)->{
            System.out.println("i am the king " +a);
        };
        obj.meth7(9);
    }
}
