import java.util.ArrayList;
class MyGenerics<T1,T2>{
    int val;
    private T1 t1;
    private T2 t2;

    public MyGenerics(int val,T1 t1,T2 t2) {
        this.val = val;
        this.t1=t1;
        this.t2=t2;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }
}
public class cwa_advanced2_generics {
    public static void main(String[] args) {
       // ArrayList arrayList=new ArrayList();
        ArrayList<Integer> arrayList=new ArrayList();
       // arrayList .add("str");
        arrayList .add(89);
        arrayList .add(657);

      //  int a= arrayList.get(0); -> this will give an error
      //  int a=(int) arrayList.get(1);
     //  int a=  arrayList.get(1);
       // System.out.println(a);

        MyGenerics<String, Integer> Mg=new MyGenerics(23,"i am a great string ", 677);
        String strr=Mg.getT1();
        Integer integer=Mg.getT2();
        Integer integer1= Mg.val;
        System.out.println(strr + integer+integer1);
    }
}
