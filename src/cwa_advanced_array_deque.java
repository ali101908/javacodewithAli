import java.util.ArrayDeque;


public class cwa_advanced_array_deque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1=new ArrayDeque<>();
        ad1.add(77);
        ad1.add(53);
        ad1.add(31);
        ad1.addFirst(10);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
    }
}
