import java.time.Duration;

class Mythr2 extends Thread{
    public void run() {
        while (true) {
            System.out.println("chaa gaye hooo");
            try{
                Thread.sleep(455);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
class Mythr4 extends Thread {

    public void run() {
        while (true) {
            System.out.println("i am a big thread");
        }
    }
}

public class cwa_ch13_Threads_methods {
    public static void main(String[] args) {
Mythr2 t7=new Mythr2();
Mythr4 t9=new Mythr4();
t7.start();
t9.start();
    }
}
