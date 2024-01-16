@FunctionalInterface
interface myfunctionalinterface{
   void thismethod();
  // void thismethod2();
}

class MyPhone {
    public void time() {
        System.out.println("it is 10pm");
    }

    public void add() {
        System.out.println("rain is raining");
    }
}
    class MyCell extends MyPhone{
        @Override
        public void time(){
            System.out.println("it is 7pm");
        }
        @Deprecated
        public int sum(int a,int b){
            return a+b;
        }
    }

public class cwa_advanced2_java_annotations {
   @SuppressWarnings("deprication")
    public static void main(String[] args) {
      MyCell MyPhone=new MyCell();
      //  MyPhone.MyCell mc=new MyPhone.MyCell();
        MyPhone.time();
        MyPhone.sum(6,7);
    }
}
