
import java.util.*;

public class cwa_advanced_linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> l1=new LinkedList<>();

        LinkedList<Integer> l2=new LinkedList<>();
        l2.add(77);
        l2.add(53);
        l2.add(31);

        l1.add(4);
        l1.add(7);
        l1.add(6);
        l1.add(9);
        l1.addLast(6);
        l1.add(2,3);
        l1.addAll(l2);

        // System.out.println(l1.indexOf(31));
       //   System.out.println(l1.set(3,455));
        //  System.out.println(l1.lastIndexOf(6));
         // System.out.println(l1.isEmpty());
        // System.out.println(l1.listIterator(3));
        System.out.println(l2.removeLastOccurrence(2));
        //  System.out.println(l1.contains(99));

        for(int i=0;i<l1.size();i++){
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
    }
}
