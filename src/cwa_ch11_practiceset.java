abstract class telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class SmartPhone extends telephone{
    @Override
    void ring() {
        System.out.println("ringing");
    }

    @Override
    void lift() {
        System.out.println("picking");
    }

    @Override
    void disconnect() {
        System.out.println("call cut");
    }
   public void speak(){
        System.out.println("talking");
    }
}

public class cwa_ch11_practiceset {
    public static void main(String[] args) {
telephone tp= new SmartPhone();
SmartPhone Sp=new SmartPhone();
Sp.lift();
//tp.speak(); --> not allowed

    }
}
