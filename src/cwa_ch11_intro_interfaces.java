
interface myCamera{
    void takeSnap();
    void takePic();
    private void greet(){
        System.out.println("hello guys");
    }
    default void record4kVideo(){   // default method . it can be override.
        greet();
        System.out.println("recording....");
    }
}

interface MyWifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class MyCellPhone{
    void callNumber(int number){
        System.out.println("calling" +number);
    }
    void pickCall(){
        System.out.println("Connecting");
    }
}
class MySmartPhone1 extends MyCellPhone implements myCamera,MyWifi{
    public void takeSnap(){
        System.out.println("jiyo");
    }
    public void takePic(){
        System.out.println("jiyo");
    }
    public String[] getNetworks() {
        System.out.println("getting list of networks");
        String[] networksList={"acha","ptcl","fiber"};
        return networksList;
    }

   public void connectToNetwork(String network) {
        System.out.println("Connecting to network" +network);
    }
}

public class cwa_ch11_intro_interfaces {
    public static void main(String[] args) {

MySmartPhone1 ms=new MySmartPhone1();
ms.record4kVideo();
String[] ar=ms.getNetworks();
for(String item:ar){
    System.out.println(item);
    ms.connectToNetwork("fiber");
    ms.callNumber(03024433);
    ms.pickCall();
}
    }
}
