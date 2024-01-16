class c1{
public int a=5;
protected int c=6;
int z=7;
private int b=9;
public void meth1(){
    System.out.println(a);
    System.out.println(c);
    System.out.println(z);
    System.out.println(b);
}
}

public class cwa_video66_accessmod {
    public static void main(String[] args) {
c1 c=new c1();
//c.meth1();
        System.out.println(c.z);
        System.out.println(c.a);
        System.out.println(c.c);
    }
}
