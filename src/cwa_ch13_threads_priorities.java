class Mythr extends Thread{
    Mythr(String name){
        super(name);
    }
    public void run() {
        int i = 34;
        while (true) {
            System.out.println("i am a thread"+ this.getName());
        }
    }
}
public class cwa_ch13_threads_priorities {
    public static void main(String[] args) {
        Mythr t1=new Mythr("Ali");
        Mythr t2=new Mythr("irha");
        Mythr t3=new Mythr("ayesha");
        Mythr t4=new Mythr("mama (most important)");
        t4.setPriority(Thread.MAX_PRIORITY);
      //  t1.start();
       // t2.start();
       // t3.start();
       // t4.start();
        System.out.println(t4.getPriority());

    }
}
