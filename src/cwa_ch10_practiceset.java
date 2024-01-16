class Rec1{
    public int length;
    public int width;

  /*  Rectangle1(int l,int w){
        System.out.println("i am the real one param of rec");
        this.length=l;
        this.width=w;
    }
   */

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    Rec1(){
        System.out.println("i am param of rec");
    }
    Rec1(int length,int width){
        System.out.println("i am the real param of rec");
        this.length=length;
        this.width=width;
    }
    public double area(){
       return width*length;
   }
}
class cuboid extends Rec1{
    public int breadth;
    public int height;

  /*  cuboid( int l,int w,int b,int c){
        super(l,w);
       System.out.println("i am param of cuboid");
       this.breadth=b;
       this.height=c;
    }
   */

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    cuboid( int length,int width,int breadth,int height) {
        super(length, width);
        System.out.println("i am param of cuboid");
        this.breadth = breadth;
        this.height = height;
    }
    public double volume(){
        return length*breadth*height;
    }

}

public class cwa_ch10_practiceset {
    public static void main(String[] args) {
      /*  Rec1 rl = new Rec1();
        rl.setLength(10);
        rl.setWidth(20);
        System.out.println(rl.getLength());
        System.out.println(rl.getWidth());
       */
         cuboid cd=new cuboid(2,3,4,5);
      /* cd.setBreadth(10);
       cd.setLength(10);
        cd.setWidth(2);
        cd.setchika(2);
       cd.setHeight(2);
        System.out.println(cd.getchika());
        System.out.println(cd.getBreadth());
        System.out.println(cd.getWidth());
        System.out.println(cd.getLength());
        System.out.println(cd.getHeight());

       */
        System.out.println(cd.area());

         System.out.println(cd.volume());

    }


        // cuboid cd=new cuboid(2,3,4,5,6);
      /* cd.setBreadth(10);
       cd.setLength(10);
        cd.setWidth(2);
        cd.setchika(2);
       cd.setHeight(2);
        System.out.println(cd.getchika());
        System.out.println(cd.getBreadth());
        System.out.println(cd.getWidth());
        System.out.println(cd.getLength());
        System.out.println(cd.getHeight());
       // System.out.println(cd.area())
       */
        // System.out.println(cd.volume());

    }

