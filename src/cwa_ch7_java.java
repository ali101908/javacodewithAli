public class cwa_ch7_java {
 static int logic(int x, int y){
        int z;
        if(x<y){
            z=x+y;
        }
        else{
            z=(x+y)*5;
        }
        return z;
    }
    public static void main(String[] args) {
        int a=4;
        int b=5;
        int c;
        c= logic(a,b);
        // method invocation using object method
       // cwa_ch7_java obj= new cwa_ch7_java();
       // c= obj.logic(a,b);
        int a1=7;
        int b1=8;
        int c1;
        c1= logic(a1,b1);
       // int c1= obj.logic (a1,b1);
        System.out.println(c);
        System.out.println(c1);
    }
}


