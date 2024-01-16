class circle1 {
     float radius;
    float area;
    float perimeter;
public float getRadius(){
    return radius;
}

    public void setRadius(float r) {
        radius = r;
    }

    public void setArea(float a) {
        area = a;
    }

    public float getArea() {
        area = 3.14f * radius * radius;
        return area;
    }

    public float getPerimeter() {
        perimeter=2*3.14f*radius;
        return perimeter;
    }

    public void setPerimeter(float P) {
        perimeter = P;
    }


    public void isCorrectlySet() {
        if (area == 3.14f * radius * radius) {
            System.out.println("Area is set correctly");

        } else {
            System.out.println("Area is not set in accordance with the radius");
        }
        if (perimeter == 2 * 3.14f * radius) {
            System.out.println("Perimeter is set correctly");
        } else {
            System.out.println("Perimeter is not set in accordance with the radius");
        }

    }


    public class cwa_ch9_modifiers {
    }
        public static void main(String[] args) {
            circle1 newcr = new circle1();
            newcr.setArea(12.26f);
            newcr.setRadius(2.0f);
            newcr.setPerimeter(12.76f);
            newcr.isCorrectlySet();
            System.out.println(newcr.getArea());
            System.out.println(newcr.getPerimeter());
            System.out.println(newcr.getRadius());
        }
    }

