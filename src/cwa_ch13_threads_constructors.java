/*class Mythr extends Thread{
    Mythr(String name){
        super(name);
    }
    public void run(){
        int i=34;
        System.out.println("i am a thread");
    }
}
class Mythr1 extends Thread{
    Mythr1(String name){
        super(name);
    }
    public void run(){
        int i=34;
        System.out.println("i am a big thread");
    }
}

 */
class MYthRunnable implements Runnable{

    public void run(){
        int i=20;
        System.out.println("i am a runnable interface");
    }
    class Mythread3 extends Thread{
      public  Mythread3 (Runnable runnable, String name){
          super(MYthRunnable.this::run,name);
      }
      public void run(){
          int i=30;
          System.out.println("jiyo i am thread 3");
      }
    }
}
public class cwa_ch13_threads_constructors {
    public static void main(String[] args) {
//Mythr t1=new Mythr("Ali");
      //  Mythr1 t2=new Mythr1("Putar");
//t1.start();
//t2.start();
       // System.out.println("i am t1 id"+t1.getId());
   //     System.out.println("i am the name of t1" +t1.getName());
        MYthRunnable Mr=new MYthRunnable();
        Thread gun2=new Thread(Mr);
        gun2.start();


    }
}
