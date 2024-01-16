class MyThreadRunnable1 implements Runnable{
    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println("i am a thread1 not a threat 1");
            i++;
        }
    }
}
class MyThreadRunnable2 implements Runnable{
    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println("i am a thread2 not a threat 2");
            i++;
        }
    }
}

public class cwa_ch13_runnable_thread {
    public static void main(String[] args) {
        MyThreadRunnable1 bullet1=new MyThreadRunnable1();
        Thread gun1=new Thread(bullet1);
        MyThreadRunnable2 Bullet2=new MyThreadRunnable2();
        Thread gun2=new Thread(Bullet2);
        gun1.start();
        gun2.start();
    }
}
