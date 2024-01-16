class Cellphone{
    public void ring(){
        System.out.println("ringing");
    }
    public void vibrate(){
        System.out.println("vibrating");

    }
    public void call(){
        System.out.println("Calling");
    }
}
class rectangle{
    int side;
    int base;
    public int area(){
        return side*base;
    }
    public int perimeter(){
        return 2*(side+base);
    }
}
class circle{
    float pi;
    int radius;
    public float area(){
        return pi*radius*radius;
    }
    public float perimeter(){
        return 2*pi*radius;
    }
}

public class cwa_ch8_practiceset {
    public static void main(String[] args) {
        // problem 1
/*Cellphone asus= new Cellphone();
asus.call();
asus.vibrate();
asus.ring();

//problem 2
        rectangle rq= new rectangle();
        rq.side=4;
        rq.base=6;
        System.out.println(rq.area());
        System.out.println(rq.perimeter());*/

        //problem 3
        circle cl=new circle();
        cl.pi=3.14159f;
        cl.radius=10;
        System.out.println(cl.area());
        System.out.println(cl.perimeter());
    }
}
