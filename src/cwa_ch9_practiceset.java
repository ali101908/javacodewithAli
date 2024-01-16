

class cylinder {
    private int radius;
    private int height;

    public cylinder(int height, int radius) {
        this.height = height;
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double surfacearea() {
        return 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
    }
}
    class rectangle1{
        private int length;
        private int breadth;

        public rectangle1() {
            this.length = 4;
            this.breadth=5;
        }
        public rectangle1(int length, int breadth) {
            this.length = length;
            this.breadth=breadth;
        }

        public int getLength() {
            return length;
        }


        public int getBreadth() {
            return breadth;
        }

    }



public class cwa_ch9_practiceset {
    public static void main(String[] args) {
      //  cylinder cr= new cylinder(9,12);
       // cr.setHeight(12);
      //  cr.setRadius(9);
       // System.out.println(cr.getHeight());
     // System.out.println(cr.getRadius());
       // System.out.println(cr.surfacearea());
        rectangle1 rl=new rectangle1(12,6);
          System.out.println(rl.getBreadth());
        System.out.println(rl.getLength());
    }
}
