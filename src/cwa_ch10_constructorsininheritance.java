class base1{
   base1(){
       System.out.println("i am a base constructor");
   }
   base1(int x){
       System.out.println(" i am a baseball constructor" +x);
   }
}
class derived extends base1{
   derived(){
     //  super(0);
       System.out.println("i am derived constructor");
   }
derived(int x,int y){
       super(x);
    System.out.println("i am an overloaded constructor of derived with value of y :" +y);
}
}
class childofderived extends derived{
    childofderived() {
        System.out.println("i am the constructor of child :");
    }
    childofderived(int x,int y,int z){
        super(x, y);
        System.out.println("i am an overloaded constructor of child with value of z as:" +z);
    }
}

public class cwa_ch10_constructorsininheritance {
    public static void main(String[] args) {
//base1 b=new base1();
//derived d=new derived(14,12);
childofderived cd=new childofderived(12,13,43);
        //childofderived cd=new childofderived();
    }
}
