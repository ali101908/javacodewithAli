abstract class Parent{
    Parent(){
        System.out.println("how are you");
    }
    public void sayhello(){
        System.out.println("hello gi");
    }
    abstract public void greet();
    abstract public void greet2();
}

class child extends Parent{
    public void greet(){
        System.out.println("how u came here");
    }
    public void greet2(){
        System.out.println("hahaha");
    }
}

 abstract class child2 extends Parent{
    public void th(){
        System.out.println("baaz ao");
    }
}

public class cwa_ch11_abstract_classes {
    public static void main(String[] args) {

        child c=new child();
        c.greet();
        c.greet2();

    }
}
