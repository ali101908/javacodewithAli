class MyThread1 extends Thread{
    public void run(){
        int i=0;
        while(i<100){
            System.out.println("Thread1 is chatting with her");
            System.out.println("I am happy!");
            i++;
        }
    }
}
class MyThread2 extends Thread{
    public void run(){
        int i=0;
        while(i<100){
            System.out.println("Thread2 is cooking");
            System.out.println("I am happy!");
            i++;
        }
    }
}

public class cwa_ch13_threads {
    public static void main(String[] args) {
        MyThread1 T1=new MyThread1();
        MyThread2 T2=new MyThread2();
        T1.start();
        T2.start();
    }
}
