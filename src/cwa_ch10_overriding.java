class A{
    public int a;
    public int ali(){
        return 4;
    }
    public void math2(){
        System.out.println("i am a math of class A");
    }
}

class B extends A{
    public void math2(){
        System.out.println("i am a math of class b");
    }
    public void math3(){
        System.out.println("i am a math of class b");
    }
}

public class cwa_ch10_overriding {
    public static void main(String[] args) {
A a=new A();
a.math2();
B b=new B();
b.math2();
    }
}
